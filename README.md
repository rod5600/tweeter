# tweeter
Projeto de teste API e FrontEnd

Tecnologia usada:

Spring-boot 2.1.7.RELEASE;

MongoDB shell version v4.2.2

Apache Maven 3.6.0

Java version "1.8.0_201"

Tomcat embedded Spring-boot Version



Este projeto consiste em  3 serviços de API  e um SPA (FrontEnd) para consumo dos 3 serviços.

Para conhecer a documentação da API basta acessar a documentação do Swagger.

http://localhost:9090/swagger-ui.html


Para rodar o projeto loca é preciso ter o MongoDB instalado  e importar os arquivos .json (que estão contidos no diretorio mongodb do projeto)para um novo database.

Importante, para importar os arquivos .json é preciso usar a ferramente import do mongo. 

Segue abaixo um exemplo para uma mongo rodando na maquina local:

mongoimport  --jsonArray --db twitter --collection tweeters --file swagger.json

Para monitorar as transações das API usaremos Pinpoint, um poderoso APM.

O cliente esta no diretorio pinpoint.



