# Microservice API de Produtos

![Java](https://img.shields.io/badge/Java-17-red) ![Spring
Boot](https://img.shields.io/badge/SpringBoot-3.x-brightgreen)
![Build](https://img.shields.io/badge/build-Maven-blue)
![API](https://img.shields.io/badge/API-REST-orange)

API REST desenvolvida com **Java e Spring Boot** para gerenciamento de
produtos.

Este projeto demonstra a construção de um serviço backend seguindo
**boas práticas de engenharia de software**, incluindo arquitetura em
camadas, integração com banco de dados relacional e desenvolvimento de
endpoints REST para operações CRUD.

O objetivo do projeto é praticar conceitos fundamentais de **backend
moderno**, como:

-   Desenvolvimento de **APIs REST**
-   Organização de aplicações com **Spring Boot**
-   Persistência de dados com **Spring Data JPA**
-   Separação de responsabilidades em **camadas de arquitetura**
-   Integração com **banco de dados relacional**

------------------------------------------------------------------------

# Tecnologias Utilizadas

-   **Java 17**
-   **Spring Boot**
-   **Spring Data JPA**
-   **Hibernate**
-   **PostgreSQL**
-   **Maven**
-   **RESTful APIs**

------------------------------------------------------------------------

# Arquitetura do Projeto

A aplicação segue o padrão de **arquitetura em camadas**, amplamente
utilizado em aplicações backend.

    Controller
       ↓
    Service
       ↓
    Repository
       ↓
    Database

### Controller

Responsável por expor os endpoints da API e receber as requisições HTTP.

### Service

Contém a lógica de negócio da aplicação.

### Repository

Camada responsável pela comunicação com o banco de dados utilizando
**Spring Data JPA**.

### Entity / Model

Representação das entidades persistidas no banco.

Essa separação melhora:

-   organização do código
-   manutenção do sistema
-   escalabilidade da aplicação

------------------------------------------------------------------------

# Funcionalidades

-   Cadastro de produtos
-   Listagem de produtos
-   Busca de produto por ID
-   Atualização de dados do produto
-   Remoção de produtos
-   Validação de dados
-   Tratamento de erros padronizado

------------------------------------------------------------------------

# Endpoints da API

## Criar produto

POST `/produtos`

### Exemplo de requisição

``` json
{
  "nome": "Produto Exemplo",
  "preco": 100.0
}
```

------------------------------------------------------------------------

## Listar produtos

GET `/produtos`

------------------------------------------------------------------------

## Buscar produto por ID

GET `/produtos/{id}`

------------------------------------------------------------------------

## Atualizar produto

PUT `/produtos/{id}`

------------------------------------------------------------------------

## Remover produto

DELETE `/produtos/{id}`

------------------------------------------------------------------------

# Como executar o projeto

## 1. Clonar o repositório

``` bash
git clone https://github.com/Fiszbejn/Microservice-API_de_produtos.git
```

## 2. Entrar na pasta do projeto

``` bash
cd Microservice-API_de_produtos
```

## 3. Executar a aplicação

``` bash
mvn spring-boot:run
```

A aplicação estará disponível em:

    http://localhost:8080

------------------------------------------------------------------------

# Exemplo de Resposta da API

``` json
{
  "id": 1,
  "nome": "Produto Exemplo",
  "preco": 100.0
}
```

------------------------------------------------------------------------

# Melhorias futuras

Algumas melhorias planejadas para evolução do projeto:

-   Containerização da aplicação com **Docker**
-   Implementação de **testes automatizados**
-   Documentação da API com **Swagger / OpenAPI**
-   Implementação de **paginação**
-   Autenticação e autorização

------------------------------------------------------------------------

# Autor

**Davi Fiszbejn**

LinkedIn\
https://www.linkedin.com/in/davifiszbejn/

GitHub\
https://github.com/Fiszbejn
