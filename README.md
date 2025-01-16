# Projeto Spring Boot - API de Clientes

Este é um projeto de demonstração desenvolvido com o **Spring Boot** e a linguagem **Java**. O objetivo principal é fornecer uma API simples para gestão de funcionários, utilizando conceitos básicos de Spring Boot, como Controllers, Services e configuração de CORS. Este projeto foi criado com fins educativos e para aumentar o conhecimento sobre o desenvolvimento de aplicações back-end com Spring Boot.

## Tecnologias Utilizadas

- **Spring Boot**: Framework Java utilizado para a construção da API.
- **Java 21**: Linguagem de programação utilizada no desenvolvimento da aplicação.
- **Maven**: Gestor de dependências utilizado para o projeto.
- **JPA/Hibernate**: Para gestão de base de dados (se necessário).

## Objetivo

Este projeto foi criado para fins de aprendizagem, permitindo que o desenvolvedor compreenda como criar uma API simples utilizando o Spring Boot e configure corretamente o CORS para permitir que o frontend aceda à API sem problemas de segurança.

## Funcionalidades

- API REST simples para a gestão de funcionários.
- Endpoint para buscar todos os clientes registados.
- Configuração de CORS para permitir acesso de origens específicas.

## Instalação

Para executar este projeto na sua máquina local, siga as instruções abaixo:

### 1. Clone o repositório

Clone este repositório para a sua máquina local utilizando o comando:

```bash
git clone https://github.com/joelmalacas/Customer/

mvn install

mvn spring-boot:run

http://localhost:8080/api/customers
