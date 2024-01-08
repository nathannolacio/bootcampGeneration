CREATE TABLE tb_produtos(
id BIGINT AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(100) NOT NULL,
preco DECIMAL(6,2) NOT NULL,
descricao VARCHAR(255),
idCategoria INT NOT NULL,
idVendedor INT NOT NULL
);

AlTER TABLE tb_produtos ADD CONSTRAINT fk_produtos_categorias
FOREIGN KEY (idCategoria) REFERENCES tb_categorias(id);
AlTER TABLE tb_produtos ADD CONSTRAINT fk_produtos_vendedores
FOREIGN KEY (idVendedor) REFERENCES tb_vendedores(id);