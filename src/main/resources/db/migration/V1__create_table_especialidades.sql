CREATE TABLE IF NOT EXISTS especialidades
(
    id        BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome      VARCHAR(100) NOT NULL UNIQUE,
    descricao VARCHAR(200),
    api_key   VARCHAR(255)
);