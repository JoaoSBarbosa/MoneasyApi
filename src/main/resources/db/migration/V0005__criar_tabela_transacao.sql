

-- Criar tabela de transações
CREATE TABLE tb_transacao (
                              id BIGSERIAL PRIMARY KEY,
                              descricao VARCHAR(255),
                              valor NUMERIC(19,2),
                              data_hora TIMESTAMP,
                              tipo typeenum,
                              usuario_id BIGINT,
                              categoria_id BIGINT,
                              criado_em TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
                              atualizado_em TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,

                              CONSTRAINT fk_usuario FOREIGN KEY (usuario_id) REFERENCES tb_usuario(id),
                              CONSTRAINT fk_categoria FOREIGN KEY (categoria_id) REFERENCES tb_categoria(id)
);
