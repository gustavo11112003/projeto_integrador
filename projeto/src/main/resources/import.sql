INSERT INTO Usuario (nome, email, dataNascimento) VALUES ('Edvan paulo', 'edvan.paulo@gmail.com', '2005-10-28');
INSERT INTO Usuario (nome, email, dataNascimento) VALUES ('Ana Silva', 'ana.silva@gmail.com', '1998-07-12');
INSERT INTO Usuario (nome, email, dataNascimento) VALUES ('Carlos Mendes', 'carlos.mendes@gmail.com', '1985-03-25');
INSERT INTO Usuario (nome, email, dataNascimento) VALUES ('Juliana Rocha', 'juliana.rocha@gmail.com', '2000-11-09');
INSERT INTO Usuario (nome, email, dataNascimento) VALUES ('Marcos Oliveira', 'marcos.oliveira@gmail.com', '1992-01-30');


INSERT INTO Editora (nome) VALUES ('DarkSide');
INSERT INTO Editora (nome) VALUES ('Companhia das Letras');
INSERT INTO Editora (nome) VALUES ('HarperCollins');
INSERT INTO Editora (nome) VALUES ('Intrínseca');
INSERT INTO Editora (nome) VALUES ('Rocco');


INSERT INTO Livro (titulo, autor, anoPublicacao, isbn, editora_id) VALUES ('Drácula', 'Bram Stoker ', 2018, '978-3-16-148410-0', 1);
INSERT INTO Livro (titulo, autor, anoPublicacao, isbn, editora_id) VALUES ('O Senhor dos Anéis', 'J.R.R. Tolkien', 2019, '978-0-261-10238-3', 2);
INSERT INTO Livro (titulo, autor, anoPublicacao, isbn, editora_id) VALUES ('O Hobbit', 'J.R.R. Tolkien', 2018, '978-0-261-10300-7', 3);
INSERT INTO Livro (titulo, autor, anoPublicacao, isbn, editora_id) VALUES ('Harry Potter e a Pedra Filosofal', 'J.K. Rowling', 2020, '978-85-325-1234-5', 4);
INSERT INTO Livro (titulo, autor, anoPublicacao, isbn, editora_id) VALUES ('Jogos Vorazes', 'Suzanne Collins', 2021, '978-84-204-1234-6', 5);


INSERT INTO Emprestimo (dataEmprestimo, dataDevolucao, usuario_id, livro_id) VALUES ('2025-10-01', '2025-10-15', 1, 1);
INSERT INTO Emprestimo (dataEmprestimo, dataDevolucao, usuario_id, livro_id) VALUES ('2025-10-05', '2025-10-20', 2, 2);
INSERT INTO Emprestimo (dataEmprestimo, dataDevolucao, usuario_id, livro_id) VALUES ('2025-10-07', '2025-10-21', 3, 3);
INSERT INTO Emprestimo (dataEmprestimo, dataDevolucao, usuario_id, livro_id) VALUES ('2025-10-09', '2025-10-25', 4, 4);
INSERT INTO Emprestimo (dataEmprestimo, dataDevolucao, usuario_id, livro_id) VALUES ('2025-10-12', '2025-10-27', 5, 5);