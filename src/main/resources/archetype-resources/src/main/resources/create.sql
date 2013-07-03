drop table if exists person cascade constraints;

drop sequence if exists person_seq;

create table person (
    id number (12) not null,
    name varchar2 (100),

    constraint pk_person primary key (id)
);

create sequence person_seq increment by 1 start with 1;