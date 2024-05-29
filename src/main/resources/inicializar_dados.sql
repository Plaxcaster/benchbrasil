CREATE TABLE IF NOT EXISTS CATEGORIA_EQUIPAMENTO(
    id_categoria_equipamento INT NOT NULL,
    nome VARCHAR(200) NOT NULL,
    fabricante VARCHAR(200) NOT NULL,
    musculo_alvo VARCHAR(200) NOT NULL,
    dias_manutencao INT NOT NULL,
    PRIMARY KEY (id)
);
DELETE FROM CATEGORIA_EQUIPAMENTO;

INSERT INTO CATEGORIA_EQUIPAMENTO (id_categoria_equipamento , nome , fabricante , musculo_alvo, dias_manutencao ) VALUES (1, 'LP250' , 'Electrolux' , 'Membros inferiores', 180);
INSERT INTO CATEGORIA_EQUIPAMENTO (id_categoria_equipamento , nome , fabricante , musculo_alvo, dias_manutencao ) VALUES (2, 'LP300' , 'Electrolux' , 'Membros inferiores', 180);
INSERT INTO CATEGORIA_EQUIPAMENTO (id_categoria_equipamento , nome , fabricante , musculo_alvo, dias_manutencao ) VALUES (3, 'Banco Sux020' , 'Fortis' , 'Peito', 360);
INSERT INTO CATEGORIA_EQUIPAMENTO (id_categoria_equipamento , nome , fabricante , musculo_alvo, dias_manutencao ) VALUES (4, 'Cross Over LXT10' , 'Fortis' , 'Geral', 180);




CREATE TABLE IF NOT EXISTS EQUIPAMENTO(
    id_equipamento INT NOT NULL,
    nome VARCHAR(200) NOT NULL,
    area_academia VARCHAR(200) NOT NULL,
    id_categoria_equipamento INT,
    PRIMARY KEY (id_equipamento),
    FOREIGN KEY (id_categoria_equipamento) REFERENCES CATEGORIA_EQUIPAMENTO(id_categoria_equipamento) 
);

DELETE FROM EQUIPAMENTO;

INSERT INTO EQUIPAMENTO (id_equipamento , nome , area_academia ) VALUES (1, 'USA');
INSERT INTO EQUIPAMENTO (id_equipamento , nome , area_academia ) VALUES (2, 'France');
INSERT INTO EQUIPAMENTO (id_equipamento , nome , area_academia ) VALUES (3, 'Brazil');
INSERT INTO EQUIPAMENTO (id_equipamento , nome , area_academia ) VALUES (3, 'Brazil');

CREATE TABLE IF NOT EXISTS FUNCIONARIO(
    id_funcionario INT NOT NULL,
    nome VARCHAR(200),
    matricula INT,
    PRIMARY KEY(id_funcionario)
);

DELETE FROM FUNCIONARIO;

INSERT INTO FUNCIONARIO (id_funcionario , nome , matricula) VALUES ( 1 , 'Zé' , 1);

CREATE TABLE IF NOT EXISTS ACESSORIO(
    id_acessorio INT NOT NULL,
    nome VARCHAR(200),
    quantidade INT,
    PRIMARY KEY(id_funcionario)
);

DELETE FROM ACESSORIO


INSERT INTO ACESSORIO (id_acessorio , nome , quantidade) VALUES ( 1 , 'presilha supino' , 5);