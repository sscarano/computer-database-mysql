# --- Sample dataset

# --- !Ups

insert into company (id,name) values (  1,'Apple Inc.');
insert into company (id,name) values (  2,'Thinking Machines');


# --- !Downs

delete from computer;
delete from company;
