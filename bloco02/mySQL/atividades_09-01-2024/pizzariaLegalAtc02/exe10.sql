SELECT sabor, preco, borda, tb_categorias.tipo, tb_categorias.formato
FROM tb_pizzas INNER JOIN tb_categorias
ON tb_pizzas.idCategoria = tb_categorias.id WHERE tb_categorias.tipo = "Doce";