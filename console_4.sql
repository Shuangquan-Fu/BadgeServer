
DROP DATABASE IF EXISTS badge;

create database badge ;



use badge;

create table dataset
(
    id int not null unique primary key auto_increment,  # for table primary key
    dataset_id int not null unique
#     dataset_admin_id int not null ,
#     constraint fk_  foreign key(dataset_admin_id) references admin_dataset(id)
);

create table admin(
    id int not null unique primary key auto_increment,
    username varchar(20) not null ,
    passwd varchar(30) not null
#     admin_dataset_id int not null ,
#     constraint fk_  foreign key(admin_dataset_id) references admin_dataset(id)
);

create table admin_dataset(
    id int not null unique  primary key auto_increment,
    admin_id int,
    dataset_id int,
    constraint fk_1  foreign key(admin_id) references admin(id),
    constraint fk_2  foreign key(dataset_id) references dataset(id)
    );

create table badge(
    id long not null unique  primary key auto_increment,
    mac_address varchar(12) not null,
    username varchar(20),
    password varchar(30),
    user_id int

  );

create table dataset_badge(
    id int not null unique  primary key auto_increment,
    badge_id int,
    dataset_id int,
    constraint fk_3  foreign key(badge_id) references badge(id),
    constraint fk_4 foreign key(dataset_id) references dataset(id)
    );



create table movement(
    id int not null unique  primary key auto_increment,
    time_stamp long,
    badge_id int,
    dataset_id int,
    x float,
    y float,
    z float
    );


create table movement_state(
    id int not null unique  primary key auto_increment,
    time_stamp long,
    badge_id int,
    x int,
    y int
);

create table voice(
    id int not null unique  primary key auto_increment,
    time_stamp long,
    badge_id int,
    dataset_id int,
    frequency float,
    decVal float
);

create table nearphones(
    id int not null unique  primary key auto_increment,
    time_stamp long,
    badge_id int,
    dataset_id int
);


# one nearphones entry has several mac_addresses
create table near_macs(
    id int not null unique  primary key auto_increment,
    mac_addr varchar(12),
    nearphones_id int,
    constraint fk_near_macs foreign key (nearphones_id) references nearphones(id)
);

create table QRCode(
    id int not null unique  primary key auto_increment,
    time_stamp long,
    badge_id int,
    dataset_id int,
    QRCode int
)




# "time_stamp": 888, // time_stamp
