# cosinha-spring-webflux
POC api tecnologia spring webflux reativa, api spring boot com mongoDB.

# objetivo
Poc para avaliar a caracteristicas do spring webflux, validando o conceito atomico onde podemos utilizar as reuisições não brocante.

# tecnologias
- Java 8
- Spring webflux
- MonogoBD
- Junit 4 e springboot test que disponibiliza o mock.

# paylod publicos
- listar todos os registros - GET
http://localhost:8080/diadodoce

- buscar por id - GET
http://localhost:8080/diadodoce/27ed6ea4-8c5e-471f-8a80-1c5a9bfb15c5

- salvar um novo registros - POST
localhost:8080/diadodoce

- remover um registro por id - DELETE
http://localhost:8080/diadodoce/602328465a696b0d3f4e588f


# Instruções para execução do projeto
Sugestão de execução através de IDE Eclipse com spring tools e jdk java instalada versão 8 ou acima.
1. Criar conta no site da da mongoDB.

2. Criar um banco de dados "cozinhar"

3. Criar um usuário de acesso ADM no mongoDB, e atualizar o arquivo de "...\src\main\resources\application.properties",
com os dados do usuário e senha criado para o seu banco "cozinhar", substitua esses parametros no arquivo incluse 
as aspas dupla "user":"password".

4. (Importante) Cadastrar no seu banco de dados o ip da seu desktop, para acessar precisa ter o ip cadastrado.

5. importar o projeto na sua IDE de preferencia, sugerido o Eclipse com spring tools, segue link para baixar abaixo.

6. Para a primeira execução se preferir, descomentar o arquivo "...\src\main\java\com\apirest\spring\webflux\DummyData.java", 
para gerar alguns registros na base de dados, após execução pare a api e comente o arquivo.

7. execute a aplicação e através do seu Browser ou do Postman, execute os end points descritos acima,
se atentar para o seu host.

8. Caso apresente erro de dependencia deve ser o do JUnit, vá no classpth do projeto adicione o JUnit 4.

# site para downloads
- IDE Eclipse
https://www.eclipse.org/community/eclipse_newsletter/2018/february/springboot.php

- mongoDB online
https://account.mongodb.com/account/register?signedOut=true



