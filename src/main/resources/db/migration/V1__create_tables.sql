CREATE TABLE Convenio
(
    id        BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome      VARCHAR(100) NOT NULL UNIQUE,
    descricao VARCHAR(200),
    api_key   VARCHAR(255)
);

CREATE TABLE Especialidade
(
    id        BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome      VARCHAR(100) NOT NULL UNIQUE,
    descricao VARCHAR(200),
    api_key   VARCHAR(255)
);