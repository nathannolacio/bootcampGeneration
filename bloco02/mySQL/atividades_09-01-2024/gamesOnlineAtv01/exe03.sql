ALTER TABLE tb_personagens
ADD CONSTRAINT fk_personagem_classe
FOREIGN KEY tb_personagens(idClasse) REFERENCES tb_classes(id);