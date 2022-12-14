INSERT INTO cliente_model (id_cliente, nome_cliente, cpf_cliente, data_nascimento, telefone)
VALUES
(101, 'Aline Silva','22455632514', '1991-12-23', '031995441412'),
(102, 'Bernardo Guimaraes','44147525698', '1985-02-10', '021995441245'),
(103, 'Camila Santos','47124551254', '1957-01-14', '011996542414'),
(104, 'Daniel Souza','35266584558', '1962-03-07', '041996558524'),
(105, 'Fernanda Pereira','10142584552', '1999-05-30', '051994147551'),
(106, 'Giovanna Ferreira','74758452141', '1986-04-25', '061995211241'),
(107, 'Hiago Reis','01021254885', '1994-07-27', '011996522415'),
(108, 'Joao Dias','01474114774', '1985-03-14', '021996552121'),
(109, 'Luana Macedo','10125212552', '1992-04-27', '031993552141'),
(110, 'Mirian Borges','14214225441', '1974-05-17', '041996552554');

INSERT INTO conta_model (id_conta, conta_agencia, conta_numero, id_cliente, saldo_real, saldo_dolar, saldo_euro, status)
VALUES
(111, 1430, 4750, 101, 1000, 0, 0, true),
(112, 1430, 4751, 102, 850, 0, 0, true),
(113, 1430, 4752, 103, 1200, 0, 0, true),
(114, 1430, 4753, 104, 0, 1000, 0, true),
(115, 1430, 4754, 105, 0, 850, 0, true),
(116, 1430, 4755, 106, 0, 1200, 0, true),
(117, 1430, 4756, 107, 0, 0, 1000, true),
(118, 1430, 4757, 108, 0, 0, 850, true),
(119, 1430, 4758, 109, 0, 0, 1200, true),
(120, 1430, 4759, 110, 500, 500, 500, true);

INSERT INTO transacao_model (id_transacao, cotacao, id_conta_transacao, moeda_destino, moeda_origem, valor_destino, valor_origem)
VALUES
(121, 0.18, 111, 'DOLAR', 'REAL', 100, 180);

