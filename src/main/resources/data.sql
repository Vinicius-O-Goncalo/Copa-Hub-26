INSERT INTO selecoes (nome, grupo)
VALUES ('Brasil', 'A');

INSERT INTO selecoes (nome, grupo)
VALUES ('Argentina', 'A');

INSERT INTO jogadores
(nome, numero, posicao, gols, selecao_id)
VALUES
('Vinicius Jr', 7, 'Atacante', 5, 1);

INSERT INTO jogadores
(nome, numero, posicao, gols, selecao_id)
VALUES
('Rodrygo', 10, 'Atacante', 3, 1);

INSERT INTO partidas
(data, gols_mandante, gols_visitante,
mandante_id, visitante_id)
VALUES
('2026-06-15', 2, 1, 1, 2);