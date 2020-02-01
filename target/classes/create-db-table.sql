--A seguir temos a criação do banco de dados e a criação de suas tabelas

--  Criando banco de dados
create databse gerenciador_de_processos;

--  Criando tabela de usuario
CREATE TABLE public.usuario (
	id serial NOT NULL,
	ativo bool NULL,
	data_hora timestamp NULL,
	data_hora_ultima_modificacao timestamp NULL,
	deletado bool NULL,
	email varchar(255) NULL,
	login varchar(255) NOT NULL,
	nome varchar(255) NULL,
	perfil int4 NULL,
	senha varchar(255) NOT NULL,
	telefone varchar(255) NULL,
	token varchar(255) NULL,
	CONSTRAINT usuario_pkey PRIMARY KEY (id)
);

--  Criando o processo
CREATE TABLE public.processo (
	id serial NOT NULL,
	ativo bool NULL,
	data_hora timestamp NULL,
	data_hora_deletado timestamp NULL,
	deletado bool NULL,
	nome varchar(255) NOT NULL,
	CONSTRAINT processo_pkey PRIMARY KEY (id)
);


--  Criando relação de usuario com processo
CREATE TABLE public.usuario_processo (
	id_usuario int4 NOT NULL,
	id_processo int4 NOT NULL,
	CONSTRAINT fkbq3y96iaqa712ctud24tgmnuf FOREIGN KEY (id_processo) REFERENCES usuario(id),
	CONSTRAINT fkgrjxnnebi6njulvp31nux2tj4 FOREIGN KEY (id_usuario) REFERENCES processo(id)
);

--  Criando o parecer do processo
CREATE TABLE public.parecer (
	id serial NOT NULL,
	ativo bool NULL,
	data_hora timestamp NULL,
	data_hora_deletado timestamp NULL,
	deletado bool NULL,
	nome varchar(255) NOT NULL,
	id_processo int4 NOT NULL,
	CONSTRAINT parecer_pkey PRIMARY KEY (id),
	CONSTRAINT fk711bvdl538jefcbdm8lfr5654 FOREIGN KEY (id_processo) REFERENCES processo(id)
)


-- Criação de usuarios do sistema
INSERT INTO public.usuario ( ativo, data_hora, data_hora_ultima_modificacao, deletado, email, login, nome, perfil, senha, telefone, token) VALUES( true, now(), NULL, false, 'email1', 'loginadministrador', 'Usuario administrador', 0, '$2a$10$xo0Avm7fk/1IODbPzvFea.wUg5JhNmBd8ptRJzKjuzeoXIX0N6UGS', NULL, NULL);
INSERT INTO public.usuario ( ativo, data_hora, data_hora_ultima_modificacao, deletado, email, login, nome, perfil, senha, telefone, token) VALUES( true, now(), NULL, false, NULL, 'loginfinalizador', 'Usuario finalizador', NULL, '$2a$10$xo0Avm7fk/1IODbPzvFea.wUg5JhNmBd8ptRJzKjuzeoXIX0N6UGS', NULL, NULL);
INSERT INTO public.usuario ( ativo, data_hora, data_hora_ultima_modificacao, deletado, email, login, nome, perfil, senha, telefone, token) VALUES( true, now(), NULL, false, NULL, 'logintriador', 'Usuario triador', NULL, '$2a$10$xo0Avm7fk/1IODbPzvFea.wUg5JhNmBd8ptRJzKjuzeoXIX0N6UGS', NULL, NULL);
