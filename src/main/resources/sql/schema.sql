create database onlinecarreseller
    with owner postgres;

create type salesstatus as enum ('SOLD', 'PENDING', 'CANCELLED', 'ARCHIVED');

alter type salesstatus owner to postgres;

create table if not exists account
(
    accountid serial not null,
    accountusername varchar(64) not null,
    accountpassword char(60) not null
);

alter table account owner to postgres;

create unique index if not exists account_accountid_uindex
    on account (accountid);

create table if not exists salesrecord
(
    fueltype varchar(8192),
    enginelocation varchar(8192),
    citympg bigint,
    compressionratio double precision,
    carname varchar(8192),
    id bigint,
    enginetype varchar(8192),
    highwaympg bigint,
    enginesize bigint,
    boreratio double precision,
    horsepower bigint,
    carwidth double precision,
    carlength double precision,
    doornumber varchar(8192),
    drivewheel varchar(8192),
    peakrpm bigint,
    cylindernumber varchar(8192),
    stroke double precision,
    wheelbase double precision,
    carbody varchar(8192),
    symboling bigint,
    aspiration varchar(8192),
    fuelsystem varchar(8192),
    carheight double precision,
    curbweight bigint,
    price numeric(16,2),
    accountid integer
        constraint salesrecord_account_accountid_fk
            references account (accountid),
    timestampadded timestamp,
    status salesstatus default 'PENDING'::salesstatus
);

alter table salesrecord owner to postgres;