-- V1__Create_tb_usuario_table.sql

CREATE TABLE tb_usuario (
                            id BIGSERIAL PRIMARY KEY,
                            nome VARCHAR(255),
                            sobrenome VARCHAR(255),
                            email VARCHAR(255),
                            senha_criptografada VARCHAR(255),
                            criado_em TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
                            atualizado_em TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);