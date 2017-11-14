drop database bancospring;
create database bancospring;
use bancospring;


drop table if exists produto;
drop table if exists usuario;
  set autocommit=0;
  create table usuario (idUsuario int(15) primary key auto_increment,
                        login varchar (50) not null unique,
                        senha varchar (100) not null ,
                        perfil enum ('ROLE_ADM','ROLE_USU'),
                        ativo boolean)Engine=innodb;

  insert into usuario  values  (null,'lu@gmail.com',sha1('123'),'ROLE_USU',true);
  insert into usuario  values (null,'bolinho@gmail.com',sha1('coti'),'ROLE_USU',true);
  insert into usuario  values (null,'paula@gmail.com',sha1('123'),'ROLE_USU',true);
  insert into usuario  values (null,'garra@gmail.com',sha1('123'),'ROLE_ADM',true);
  
  
  create table produto(idProduto int primary key auto_increment,
                       produto varchar (50),
                       preco double,
                       quantidade int)Engine=innoDB;
                       
           
  insert into produto values (null,'hiphone',800,1);
  insert into produto values (null,'hipad',400,1);
  insert into produto values (null,'xangung',700,1);
  insert into produto values (null,'galalao',800,1);
  
  commit;
  
  
                       
    