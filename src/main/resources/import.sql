INSERT INTO public.posto_grad(id, descricao, sigla)VALUES (1, 'General de Exército', 'Gen Ex');
INSERT INTO public.posto_grad(id, descricao, sigla)VALUES (2, 'General de Divisão', 'Gen Div');
INSERT INTO public.posto_grad(id, descricao, sigla)VALUES (3, 'General de Brigada', 'Gen Bgda');
INSERT INTO public.posto_grad(id, descricao, sigla)VALUES (4, 'Coronel', 'Cel');
INSERT INTO public.posto_grad(id, descricao, sigla)VALUES (5, 'Tenente Coronel', 'Ten Cel');
INSERT INTO public.posto_grad(id, descricao, sigla)VALUES (6, 'Major', 'Maj');
INSERT INTO public.posto_grad(id, descricao, sigla)VALUES (7, 'Capitão', 'Cap');
INSERT INTO public.posto_grad(id, descricao, sigla)VALUES (8, '1º Tenente', '1 Ten');
INSERT INTO public.posto_grad(id, descricao, sigla)VALUES (9, '2º Tenente', '2 Ten');
INSERT INTO public.posto_grad(id, descricao, sigla)VALUES (10, 'Aspirante', 'Aspirante');
INSERT INTO public.posto_grad(id, descricao, sigla)VALUES (11, 'Subtenente', 'S Ten');
INSERT INTO public.posto_grad(id, descricao, sigla)VALUES (12, '1º Sargento', '1 Sgt');
INSERT INTO public.posto_grad(id, descricao, sigla)VALUES (13, '2º Sargento', '2 Sgt');
INSERT INTO public.posto_grad(id, descricao, sigla)VALUES (14, '3º Sargento', '3 Sgt');
INSERT INTO public.posto_grad(id, descricao, sigla)VALUES (15, 'Cabo', 'Cb');
INSERT INTO public.posto_grad(id, descricao, sigla)VALUES (16, 'Soldado', 'Sd EP');
INSERT INTO public.posto_grad(id, descricao, sigla)VALUES (17, 'Recruta', 'Sd EV');


INSERT INTO public.companhia(id, descricao, sigla)VALUES (1, 'Companhia de Comando', 'Cia C');
INSERT INTO public.companhia(id, descricao, sigla)VALUES (2, 'Companhia de Apoio', 'Cia Ap');
INSERT INTO public.companhia(id, descricao, sigla)VALUES (3, 'Companhia de Guardas', 'Cia Gd');

INSERT INTO public.tipo_militar(id, descricao, sigla) VALUES (1, 'Oficial de Carreira', 'Of Car');
INSERT INTO public.tipo_militar(id, descricao, sigla) VALUES (2, 'Oficial Combatente Temporário', 'OCT');
INSERT INTO public.tipo_militar(id, descricao, sigla) VALUES (3, 'Oficial Intendente Temporário', 'OIT');
INSERT INTO public.tipo_militar(id, descricao, sigla) VALUES (4, 'Oficial Técnico Temporário', 'OTT');
INSERT INTO public.tipo_militar(id, descricao, sigla) VALUES (5, 'Oficial Médico Temporário', 'OMT');
INSERT INTO public.tipo_militar(id, descricao, sigla) VALUES (6, 'Oficial Dentista Temporário', 'ODT');
INSERT INTO public.tipo_militar(id, descricao, sigla) VALUES (7, 'Praça de Carreira', 'Pr Car');
INSERT INTO public.tipo_militar(id, descricao, sigla) VALUES (8, 'Sargento do Quadro Especial', 'QE');
INSERT INTO public.tipo_militar(id, descricao, sigla) VALUES (9, 'Sargento Combatente Temporário', 'SCT');
INSERT INTO public.tipo_militar(id, descricao, sigla) VALUES (10, 'Sargento Intendente Temporário', 'SIT');
INSERT INTO public.tipo_militar(id, descricao, sigla) VALUES (11, 'Sargento Técnico Temporário', 'STT');
INSERT INTO public.tipo_militar(id, descricao, sigla) VALUES (12, 'Efetivo Profissional', 'EP');
INSERT INTO public.tipo_militar(id, descricao, sigla) VALUES (13, 'Efetivo Variável', 'EV');
INSERT INTO public.tipo_militar(id, descricao, sigla) VALUES (14, 'Prestador de Tarefa por Tempo Certo', 'PTTC');

INSERT INTO public.militar(id, cpf, ativo, data_licenciamento, data_nascimento, data_praca, genero, identidade, nome_completo, nome_guerra, companhia_id, posto_grad_id, tipo_militar_id) VALUES (1, '04776390116', true , '28/02/2021', '06/06/1994', '01/03/2013', 'MASCULINO', '1106877572', 'VALBER MEDEIROS DE QUEIROZ JUNIOR', 'VALBER JUNIOR', 2, 14, 9);
INSERT INTO public.militar(id, cpf, ativo, data_licenciamento, data_nascimento, data_praca, genero, identidade, nome_completo, nome_guerra, companhia_id, posto_grad_id, tipo_militar_id) VALUES (2, '04776390116', true , '28/02/2021', '06/06/1994', '01/03/2013', 'MASCULINO', '1106877572', 'DANILO SILVA DE OLIVEIRA', 'DANILO', 2, 13, 9);
INSERT INTO public.militar(id, cpf, ativo, data_licenciamento, data_nascimento, data_praca, genero, identidade, nome_completo, nome_guerra, companhia_id, posto_grad_id, tipo_militar_id) VALUES (3, '04776390116', true , '28/02/2021', '06/06/1994', '01/03/2013', 'FEMININO', '1106877572', 'ANDREIA APARECIDA SOUSA CAMPOS', 'ANDREIA', 2, 13, 9);
INSERT INTO public.militar(id, cpf, ativo, data_licenciamento, data_nascimento, data_praca, genero, identidade, nome_completo, nome_guerra, companhia_id, posto_grad_id, tipo_militar_id) VALUES (4, '04776390116', true , '28/02/2021', '06/06/1994', '01/03/2013', 'FEMININO', '1106877572', 'ELAINE DE OLIVEIRA SOUZA', 'ELAINE SOUZA', 2, 14, 9);
INSERT INTO public.militar(id, cpf, ativo, data_licenciamento, data_nascimento, data_praca, genero, identidade, nome_completo, nome_guerra, companhia_id, posto_grad_id, tipo_militar_id) VALUES (5, '04776390116', true , '28/02/2021', '06/06/1994', '01/03/2013', 'MASCULINO', '1106877572', 'GABRIEL NUNES POSTIGLIONI', 'POSTIGLIONI', 1, 15, 9);
INSERT INTO public.militar(id, cpf, ativo, data_licenciamento, data_nascimento, data_praca, genero, identidade, nome_completo, nome_guerra, companhia_id, posto_grad_id, tipo_militar_id) VALUES (6, '04776390116', true , '28/02/2021', '06/06/1994', '01/03/2013', 'FEMININO', '1106877572', 'GLÁUCIA PANTA CARDOSO DE CAMPOS', 'GLÁUCIA PANTA', 2, 14, 9);
INSERT INTO public.militar(id, cpf, ativo, data_licenciamento, data_nascimento, data_praca, genero, identidade, nome_completo, nome_guerra, companhia_id, posto_grad_id, tipo_militar_id) VALUES (7, '04776390116', true , '28/02/2021', '06/06/1994', '01/03/2013', 'MASCULINO', '1106877572', 'LEONARDO SILVA DOS SANTOS', 'SILVA', 1, 14, 9);
INSERT INTO public.militar(id, cpf, ativo, data_licenciamento, data_nascimento, data_praca, genero, identidade, nome_completo, nome_guerra, companhia_id, posto_grad_id, tipo_militar_id) VALUES (8, '04776390116', true , '28/02/2021', '06/06/1994', '01/03/2013', 'FEMININO', '1106877572', 'LORRANY ESTEFFANE CORDEIRO BARROS', 'LORRANY ESTEFFANE', 1, 14, 9);
INSERT INTO public.militar(id, cpf, ativo, data_licenciamento, data_nascimento, data_praca, genero, identidade, nome_completo, nome_guerra, companhia_id, posto_grad_id, tipo_militar_id) VALUES (9, '04776390116', true , '28/02/2021', '06/06/1994', '01/03/2013', 'MASCULINO', '1106877572', 'FILIPE CAIXETA CARVALHO', 'FILIPE CAIXETA', 2, 15, 9);
INSERT INTO public.militar(id, cpf, ativo, data_licenciamento, data_nascimento, data_praca, genero, identidade, nome_completo, nome_guerra, companhia_id, posto_grad_id, tipo_militar_id) VALUES (10, '04776390116', true , '28/02/2021', '06/06/1994', '01/03/2013', 'FEMININO', '1106877572', 'DANIELE BARBOSA DE CASTRO', 'DANIELE CASTRO', 2, 15, 9);
INSERT INTO public.militar(id, cpf, ativo, data_licenciamento, data_nascimento, data_praca, genero, identidade, nome_completo, nome_guerra, companhia_id, posto_grad_id, tipo_militar_id) VALUES (11, '04776390116', true , '28/02/2021', '06/06/1994', '01/03/2013', 'FEMININO', '1106877572', 'ARIELA ARAÚJO FONSECA', 'ARIELA FONSECA', 3, 13, 9);
INSERT INTO public.militar(id, cpf, ativo, data_licenciamento, data_nascimento, data_praca, genero, identidade, nome_completo, nome_guerra, companhia_id, posto_grad_id, tipo_militar_id) VALUES (12, '04776390116', true , '28/02/2021', '06/06/1994', '01/03/2013', 'FEMININO', '1106877572', 'RENATA FONTINELE DE ARAUJO', 'FONTINELE', 3, 13, 9);
INSERT INTO public.militar(id, cpf, ativo, data_licenciamento, data_nascimento, data_praca, genero, identidade, nome_completo, nome_guerra, companhia_id, posto_grad_id, tipo_militar_id) VALUES (13, '04776390116', true , '28/02/2021', '06/06/1994', '01/03/2013', 'MASCULINO', '1106877572', 'FABRICIO ROMUALDO SPINDOLA', 'ROMUALDO', 3, 12, 9);
INSERT INTO public.militar(id, cpf, ativo, data_licenciamento, data_nascimento, data_praca, genero, identidade, nome_completo, nome_guerra, companhia_id, posto_grad_id, tipo_militar_id) VALUES (14, '04776390116', true , '28/02/2021', '06/06/1994', '01/03/2013', 'FEMININO', '1106877572', 'KELMA CRISTINA ALVES PEREIRA', 'KELMA CRISTINA', 2, 14, 9);
INSERT INTO public.militar(id, cpf, ativo, data_licenciamento, data_nascimento, data_praca, genero, identidade, nome_completo, nome_guerra, companhia_id, posto_grad_id, tipo_militar_id) VALUES (15, '04776390116', true , '28/02/2021', '06/06/1994', '01/03/2013', 'MASCULINO', '1106877572', 'DANIEL DE JESUS CORNEL DA SILVA', 'DANIEL', 1, 11, 9);
INSERT INTO public.militar(id, cpf, ativo, data_licenciamento, data_nascimento, data_praca, genero, identidade, nome_completo, nome_guerra, companhia_id, posto_grad_id, tipo_militar_id) VALUES (16, '04776390116', true , '28/02/2021', '06/06/1994', '01/03/2013', 'MASCULINO', '1106877572', 'MARLLON MENEZES DE SOUZA', 'MARLLON MENEZES', 1, 11, 9);
INSERT INTO public.militar(id, cpf, ativo, data_licenciamento, data_nascimento, data_praca, genero, identidade, nome_completo, nome_guerra, companhia_id, posto_grad_id, tipo_militar_id) VALUES (17, '04776390116', true , '28/02/2021', '06/06/1994', '01/03/2013', 'MASCULINO', '1106877572', 'ALESSANDRO BATISTA DE MACEDO', 'ALESSANDRO', 1, 11, 9);
INSERT INTO public.militar(id, cpf, ativo, data_licenciamento, data_nascimento, data_praca, genero, identidade, nome_completo, nome_guerra, companhia_id, posto_grad_id, tipo_militar_id) VALUES (18, '04776390116', true , '28/02/2021', '06/06/1994', '01/03/2013', 'MASCULINO', '1106877572', 'FELIPE GOMES PESSOA', 'GOMES', 3, 11, 9);
INSERT INTO public.militar(id, cpf, ativo, data_licenciamento, data_nascimento, data_praca, genero, identidade, nome_completo, nome_guerra, companhia_id, posto_grad_id, tipo_militar_id) VALUES (19, '04776390116', true , '28/02/2021', '06/06/1994', '01/03/2013', 'FEMININO', '1106877572', 'MONALISA MARTINS VIEIRA VARELO', 'MONALISA', 2, 12, 9);
INSERT INTO public.militar(id, cpf, ativo, data_licenciamento, data_nascimento, data_praca, genero, identidade, nome_completo, nome_guerra, companhia_id, posto_grad_id, tipo_militar_id) VALUES (20, '04776390116', true , '28/02/2021', '06/06/1994', '01/03/2013', 'FEMININO', '1106877572', 'NAYARA HELLEN ALMEIDA VOLLAIS', 'ALMEIDA', 3, 12, 9);
INSERT INTO public.militar(id, cpf, ativo, data_licenciamento, data_nascimento, data_praca, genero, identidade, nome_completo, nome_guerra, companhia_id, posto_grad_id, tipo_militar_id) VALUES (21, '04776390116', true , '28/02/2021', '06/06/1994', '01/03/2013', 'FEMININO', '1106877572', 'ALBA FERREIRA GONÇALVES', 'ALBA', 3, 12, 9);
INSERT INTO public.militar(id, cpf, ativo, data_licenciamento, data_nascimento, data_praca, genero, identidade, nome_completo, nome_guerra, companhia_id, posto_grad_id, tipo_militar_id) VALUES (22, '04776390116', true , '28/02/2021', '06/06/1994', '01/03/2013', 'FEMININO', '1106877572', 'HELEN SILVA VIAJANTE VITORINO', 'HELEN SILVA', 1, 12, 9);




INSERT INTO public.promocao(id, data_promocao, posto_grad_id)VALUES (1, '01/12/2014', 15);
INSERT INTO public.promocao(id, data_promocao, posto_grad_id)VALUES (2, '01/09/2015', 14);

INSERT INTO public.militar_promocao(militar_id, promocao_id)VALUES (1, 1);
INSERT INTO public.militar_promocao(militar_id, promocao_id)VALUES (1, 2);


