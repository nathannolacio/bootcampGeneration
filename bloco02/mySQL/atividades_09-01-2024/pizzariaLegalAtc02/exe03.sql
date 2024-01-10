ALTER TABLE tb_pizzas
ADD CONSTRAINT fk_pizza_categoria
FOREIGN KEY tb_pizzas(idCategoria) REFERENCES tb_categorias(id);