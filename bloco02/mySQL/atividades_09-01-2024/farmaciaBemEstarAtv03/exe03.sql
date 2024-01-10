ALTER TABLE tb_produtos
ADD CONSTRAINT fk_produto_categoria
FOREIGN KEY tb_produtos(idCategoria) REFERENCES tb_categorias(id);