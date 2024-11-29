-- estudante
INSERT INTO estudante (matricula, nome) VALUES (1002, 'Lucas');
INSERT INTO estudante (matricula, nome) VALUES (1003, 'Ana');
INSERT INTO estudante (matricula, nome) VALUES (1004, 'Pedro');
INSERT INTO estudante (matricula, nome) VALUES (1005, 'Maria');
INSERT INTO estudante (matricula, nome) VALUES (1006, 'João');
INSERT INTO estudante (matricula, nome) VALUES (1007, 'Julia');
INSERT INTO estudante (matricula, nome) VALUES (1008, 'Rafael');
INSERT INTO estudante (matricula, nome) VALUES (1009, 'Beatriz');
INSERT INTO estudante (matricula, nome) VALUES (1010, 'Gabriel');
INSERT INTO estudante (matricula, nome) VALUES (1011, 'Sofia');

-- curso

INSERT INTO curso (codigo_curso, nome) VALUES
  ('SEG009', 'Segurança da Informação'),
  ('PRO010', 'Programação para Dispositivos Móveis');


-- professor

INSERT INTO professor (especialidade, nome) VALUES ('História', 'Maria');
INSERT INTO professor (especialidade, nome) VALUES ('Matemática', 'Pedro');

-- turma

INSERT INTO turma (codigo_turma, curso_id, professor_id, horario) VALUES ('T001' ,'1', '1', '12:00');
INSERT INTO turma (codigo_turma, curso_id, professor_id, horario) VALUES ('T002' ,'2', '2', '13:00');

-- turma estundate
INSERT INTO turma_estudante (estudante_id, turma_id) VALUES (1, 1); -- lucas , T001
INSERT INTO turma_estudante (estudante_id, turma_id) VALUES (2, 1); -- ana, T001
INSERT INTO turma_estudante (estudante_id, turma_id) VALUES (3, 1); -- Pedro , T001
INSERT INTO turma_estudante (estudante_id, turma_id) VALUES (4, 1); -- Maria , T001
INSERT INTO turma_estudante (estudante_id, turma_id) VALUES (5, 1); -- Joao , T001


INSERT INTO turma_estudante (estudante_id, turma_id) VALUES (6, 2); -- Julia, T002
INSERT INTO turma_estudante (estudante_id, turma_id) VALUES (7, 2); -- Rafael , T002
INSERT INTO turma_estudante (estudante_id, turma_id) VALUES (8, 2); -- Beatriz, T002
INSERT INTO turma_estudante (estudante_id, turma_id) VALUES (9, 2); -- Gabrial, T002
INSERT INTO turma_estudante (estudante_id, turma_id) VALUES (10, 2); -- sofia , T002
