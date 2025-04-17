CREATE TABLE tb_categoria (
                              id BIGSERIAL PRIMARY KEY,
                              nome VARCHAR(255) NOT NULL,
                              tipo typeenum NOT NULL
);
