CREATE SEQUENCE public.hibernate_sequence
INCREMENT BY 1
MINVALUE 1
MAXVALUE 95555555555555
START 1
CACHE 1
NO CYCLE;

CREATE TABLE public.funcionarios (
id int8 primary key,
matricula int8,
nome varchar(50),
departamento varchar(50),
cargo varchar(50),
telefone varchar(11)
);

CREATE TABLE public.pacientes(
id int8 primary key,
nome varchar(50),
nascimento date,
telefone varchar(11)
);

CREATE TABLE public.historico_do_paciente (
id int8 primary key,
data_e_hora_de_entrada timestamp,
data_e_hora_de_saida timestamp,
diagnostico varchar(250),
id_pacientes int8,
id_funcionarios int8,

constraint fk_pacientes
foreign key (id_pacientes)
references pacientes(id),

constraint fk_funcionarios
foreign key (id_funcionarios)
references funcionarios(id)
);