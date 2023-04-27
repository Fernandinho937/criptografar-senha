# criptografar-senha

## **Sobre**

Nesse projeto, visando a segurança, criptografamos a senha dos nossos usuários utilizando os pasword encoders e gravamos tudo no banco de dados H2.
Ao desenvolver uma API rest com Java e Spring Boot é muito comum as aplicações precisarem de um um usuário e senha e essas informações precisam ser 
guardadas com segurança e é aí que entra o Spring Security.


## **Tecnologias**
- Java
- SpringBoot
- Spring Security
- API Rest


## **Features**
[ x ] Criptografar senhas

## **Passos para Executar o Projeto**
- Clone esse projeto para sua máquina
- Start a aplicação utilizando o arquivo CriptografarSenhaApplication.java
- Abra o banco de dados H2 em outra aba através do endereço: localhost:8080/h2-console pode ver no primeiro gif abaixo na demonstração
- Ao abrir o banco de dados é possível observar o id, nome do usuário e a senhas devidamente criptografadas
-Obs.: Caso por algum motivo não consiga abrir com esses procedimentos com a demonstração abaixo fica bem claro o objetivo final do projeto




## **Demonstração**
- Entrando no banco de dados:

![bd criptografar senha](https://user-images.githubusercontent.com/86840722/234860428-9ca35acf-291c-4ccc-8410-72b7759907f8.gif)

- Visualizando os dado criptografados:

![bd id, login e senha criptograda](https://user-images.githubusercontent.com/86840722/234860793-13e6dfec-aa79-458b-995c-98e01496d823.gif)
