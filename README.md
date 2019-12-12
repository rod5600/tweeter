# PROJETO TWIITER API, FRONTEND E APM
![](https://ibb.co/N31Ntw7)  



*******
Tecnolgias Usadas 
 1. [Spring-boot 2.1.7.RELEASE](#)
 2. [MongoDB shell version v4.2.2](#)
 3. [Apache Maven 3.6.0](#)
 4. [Java version "1.8.0_201"](#)
 5. [Tomcat embedded Spring-boot Version](#)

*******

<div id='whatismarkdown'/>  

## O que é  Projeto Twiiter ?  
 :  

  >*Este projeto consiste em  3 serviços de API  e um SPA (FrontEnd) para consumo dos 3 serviços.

       Para conhecer a documentação da API basta acessar a documentação do Swagger.* 

       http://localhost:9090/swagger-ui.html  



## Como rodar o Projeto local?
Muito simples :
 * **Arquivos .json** : Para rodar o projeto loca é preciso ter o MongoDB instalado  e importar os arquivos .json (que estão contidos no diretorio mongodb do projeto)para um novo database.

      * **Importante**  para importar os arquivos .json é preciso usar a ferramente import do mongo. 

          Segue abaixo um exemplo para uma mongo rodando na maquina local:
          
            $mongoimport  --jsonArray --db twitter --collection tweeters --file swagger.json

 * **Compilar API com Maven** : É preciso ter o apache maven instalado na versão 3.6.0 ou superior.
                  Para gerar o arquivo .jar é preciso apenas rodar o comando:
                   
                   $ mvn clean install
    Com isso o arquivo .jar sera gerado na pasta target do projeto, como temos o Tomcat embarcado é preciso apenas rodar o comando:
                   
                   $ java -jar target/arquivo.jar;  


 * **PinPoint APM** : Para monitorar as transações das API usaremos Pinpoint, um poderoso APM.
      
      O arquivo .jar encontra-se no diretorio de nome pinpoint, e para executar o cliente, é preciso apenas rodar sua aplicação java com o parametro :

                         $ -javaagent:$AGENT_PATH/pinpoint-bootstrap-$VERSION.jar


      Para mais informações sobre o processo de instalação é só acessar o seguinte link:

                         https://naver.github.io/pinpoint/1.8.0/installation.html
