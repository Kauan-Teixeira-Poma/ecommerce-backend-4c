-- 1. Categoria
INSERT INTO categoria (id, nome) VALUES (1, 'Eletrônicos');
INSERT INTO categoria (id, nome) VALUES (2, 'Livros');
INSERT INTO categoria (id, nome) VALUES (3, 'Informática');
INSERT INTO categoria (id, nome) VALUES (4, 'Vestuário');
INSERT INTO categoria (id, nome) VALUES (5, 'Casa e Decoração');

-- 2. Produto
INSERT INTO produto (id, nome, preco, categoria_id) VALUES (1, 'Smartphone Galaxy', 1500.00, 1);
INSERT INTO produto (id, nome, preco, categoria_id) VALUES (2, 'Livro Clean Code', 120.00, 2);
INSERT INTO produto (id, nome, preco, categoria_id) VALUES (3, 'Notebook Dell', 3500.00, 3);
INSERT INTO produto (id, nome, preco, categoria_id) VALUES (4, 'Camiseta Algodão', 50.00, 4);
INSERT INTO produto (id, nome, preco, categoria_id) VALUES (5, 'Luminária LED', 80.00, 5);

-- 3. Cliente
INSERT INTO cliente (id, nome, email) VALUES (1, 'Maria Silva', 'maria@gmail.com');
INSERT INTO cliente (id, nome, email) VALUES (2, 'João Souza', 'joao@gmail.com');
INSERT INTO cliente (id, nome, email) VALUES (3, 'Ana Costa', 'ana@gmail.com');
INSERT INTO cliente (id, nome, email) VALUES (4, 'Carlos Oliveira', 'carlos@gmail.com');
INSERT INTO cliente (id, nome, email) VALUES (5, 'Beatriz Lima', 'beatriz@gmail.com');

-- 4. Pedido
INSERT INTO pedido (id, cliente_id, valor_total, data, status) VALUES (1, 1, 1500.00, '2026-09-01 10:00:00', 'PAGO');
INSERT INTO pedido (id, cliente_id, valor_total, data, status) VALUES (2, 2, 240.00, '2026-09-02 11:30:00', 'PAGO');
INSERT INTO pedido (id, cliente_id, valor_total, data, status) VALUES (3, 3, 3500.00, '2026-09-03 14:15:00', 'PAGO');
INSERT INTO pedido (id, cliente_id, valor_total, data, status) VALUES (4, 4, 150.00, '2026-09-04 16:45:00', 'PAGO');
INSERT INTO pedido (id, cliente_id, valor_total, data, status) VALUES (5, 5, 160.00, '2026-09-05 18:00:00', 'PAGO');

-- 5. ItemPedido
INSERT INTO item_pedido (id, pedido_id, produto_id, quantidade, valor_unitario) VALUES (1, 1, 1, 1, 1500.00);
INSERT INTO item_pedido (id, pedido_id, produto_id, quantidade, valor_unitario) VALUES (2, 2, 2, 2, 120.00);
INSERT INTO item_pedido (id, pedido_id, produto_id, quantidade, valor_unitario) VALUES (3, 3, 3, 1, 3500.00);
INSERT INTO item_pedido (id, pedido_id, produto_id, quantidade, valor_unitario) VALUES (4, 4, 4, 3, 50.00);
INSERT INTO item_pedido (id, pedido_id, produto_id, quantidade, valor_unitario) VALUES (5, 5, 5, 2, 80.00);

-- 6. Pagamento
INSERT INTO pagamento (id, pedido_id, valor, data, status, tipo) VALUES (1, 1, 1500.00, '2026-09-01 10:05:00', 'QUITADO', 'CARTAO');
INSERT INTO pagamento (id, pedido_id, valor, data, status, tipo) VALUES (2, 2, 240.00, '2026-09-02 11:35:00', 'QUITADO', 'PIX');
INSERT INTO pagamento (id, pedido_id, valor, data, status, tipo) VALUES (3, 3, 3500.00, '2026-09-03 14:20:00', 'QUITADO', 'BOLETO');
INSERT INTO pagamento (id, pedido_id, valor, data, status, tipo) VALUES (4, 4, 150.00, '2026-09-04 16:50:00', 'QUITADO', 'CARTAO');
INSERT INTO pagamento (id, pedido_id, valor, data, status, tipo) VALUES (5, 5, 160.00, '2026-09-05 18:05:00', 'QUITADO', 'PIX');