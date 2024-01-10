SELECT tb_produtos.nome, preco, quantidade, marca, tb_categorias.nome
FROM tb_produtos INNER JOIN tb_categorias
ON tb_produtos.idCategoria = tb_categorias.id WHERE tb_categorias.nome = "Cuidado da pele";