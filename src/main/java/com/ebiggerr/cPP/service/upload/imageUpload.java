package com.ebiggerr.cPP.service.upload;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

public class imageUpload {

    private static String UPLOADED_FOLDER="src/main/resources/static/images/car/";

    public static String saveUploadFile(MultipartFile file, long car_id) throws IOException {

        String extension = null;
        String filename = String.valueOf(car_id);

        if( !file.isEmpty() ){

            //String[] format = file.getOriginalFilename().split(".");
            extension = Objects.requireNonNull(file.getOriginalFilename()).split("\\.")[1];

            filename = filename+ "."+ extension;

            //normal size
            byte[] bytes = file.getBytes();
            Path path = Paths.get(UPLOADED_FOLDER + filename);
            Files.write(path, bytes);

            //thumbnail size
            //TODO thumbnail resize

        }

        return "images/car/"+ filename /*+ "."+ extension*/;

    }
}
