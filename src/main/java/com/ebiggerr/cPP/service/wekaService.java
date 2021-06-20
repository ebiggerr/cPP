package com.ebiggerr.cPP.service;

import com.ebiggerr.cPP.domain.request;
import com.opencsv.CSVWriter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

import weka.classifiers.Evaluation;
import weka.classifiers.functions.LinearRegression;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.CSVLoader;
import weka.core.converters.ConverterUtils.DataSource;

import java.io.File;
import java.io.FileWriter;


//@PropertySource("classpath:application.properties")
public class wekaService {

    //@Value("${lr.model.path}")
    //private String LRModelPath;

    private Instances instancesFromDataSource;

    private final String DATA_FILE_PATH="src/main/resources/data.arff";
    private final String DATA_CSV_FILE_PATH="src/main/resources/test data.csv";

    private LinearRegression lr;
    /**
     * 
     *
     * @return A LinearRegression object built from the serialization of model from the .model file
     * @throws Exception IO Exception when trying to read the .model file with specified path and filename
     */
    public LinearRegression loadLRModel() throws Exception {

        return (LinearRegression) weka.core.SerializationHelper.read("src/main/resources/carPP_LR.model");
    }


    public double generateResultFromRequestUsingLR(request request,String dataSourceChoice) throws Exception {

        //TODO map request's fields and write to CSV file
        CSVWriter writer = new CSVWriter(new FileWriter(DATA_CSV_FILE_PATH, true)); // append the the end of the file

        boolean validInput = checkValid(request);

        if( validInput ) {

            String[] record = {request.getCar_ID(), request.getSymboling(), request.getCarName(), request.getFueltype(), request.getAspiration(), request.getDoornumber(), request.getCarbody(), request.getDrivewheel(), request.getEnginelocation(), request.getWheelbase(), request.getCarlength(), request.getCarwidth(), request.getCarheight(), request.getCurbweight(), request.getEnginetype(), request.getCylindernumber(), request.getEnginesize(), request.getFuelsystem(), request.getBoreratio(), request.getStroke(), request.getCompressionratio(), request.getHorsepower(), request.getPeakrpm(), request.getCitympg(), request.getHighwaympg(), "0"};

            //not apply quotes to the values
            writer.writeNext(record, false);

            writer.close();

        }
        else{
            return 0.0;
        }

        lr = loadLRModel();

        //ARFF variant
        DataSource dataSource = new DataSource(DATA_FILE_PATH);

        if( dataSourceChoice.equals("arff")){
            instancesFromDataSource = dataSource.getDataSet();
        }

        //CSV variant
        CSVLoader csvLoader = new CSVLoader();
        csvLoader.setSource(new File(DATA_CSV_FILE_PATH));
        if( dataSourceChoice.equals("csv")){
            instancesFromDataSource = csvLoader.getDataSet();
        }

        //get the last instance
        Instance lastInstance = instancesFromDataSource.get( instancesFromDataSource.numInstances()-1 );

        //index of class ( prediction ) "price"
        instancesFromDataSource.setClassIndex( instancesFromDataSource.numAttributes() -1 );

        //evaluation
        Evaluation LR_eval = new Evaluation( instancesFromDataSource );
        LR_eval.evaluateModel(lr,instancesFromDataSource);
        //System.out.println( LR_eval.toSummaryString() ); //un-comment to reveal the model's evaluation

        //get the last instance and perform the prediction
        double pricePrediction = lr.classifyInstance( lastInstance );

        if( Math.round(pricePrediction) == 13277.0 ) return 0.0; // value of prediction when the instance from csv is ,,,,,,,,,,,,,... (no value)
        
        return Math.round( pricePrediction );
    }

    private boolean checkValid(request request) {

        /*boolean valid = true;
        if( !Character.isDigit( Integer.parseInt(request.getCar_ID())  ) ){
            valid = false;
        }
        else if( !Character.isDigit( Integer.parseInt(request.getSymboling()) ) ){
            valid = false;
        }
        else if( !request.getFueltype().toLowerCase().equals("gas") || !request.getFueltype().toLowerCase().equals("diesel") ){
            valid = false;
        }
        else if( !request.getAspiration().toLowerCase().equals("std") || !request.getAspiration().toLowerCase().equals("turbo") ){
            valid = false;
        }
        else if( !request.getDoornumber().toLowerCase().equals("two") || !request.getDoornumber().toLowerCase().equals("four") ){
            valid = false;
        }
        else if( !request.getCarbody().toLowerCase().equals("convertible") || !request.getCarbody().toLowerCase().equals("hatchback") || !request.getCarbody().toLowerCase().equals("sedan") || !request.getCarbody().toLowerCase().equals("wagon") || !request.getCarbody().toLowerCase().equals("hardtop")){
            valid = false;
        }
        else if( !request.getDrivewheel().toLowerCase().equals("rwd") || !request.getDrivewheel().toLowerCase().equals("4wd") || !request.getDrivewheel().toLowerCase().equals("fwd") ){
            valid = false;
        }
        else if( !request.getEnginelocation().toLowerCase().equals("front") || !request.getEnginelocation().toLowerCase().equals("rear") ){
            valid = false;
        }*/

        //TODO more validation and checking


        return true;

    }


}
