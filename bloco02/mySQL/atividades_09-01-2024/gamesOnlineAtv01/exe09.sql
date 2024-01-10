SELECT nome, ataque, defesa, nivel, tb_classes.tipo, tb_classes.raridade
FROM tb_personagens INNER JOIN tb_classes
ON tb_personagens.idClasse = tb_classes.id;