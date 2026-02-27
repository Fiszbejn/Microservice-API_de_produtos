# Microservice API de Produtos (ms-produto)

API REST desenvolvida durante as aulas de **Microservice and Web Engineering & IT Services**, com foco em aplicar boas práticas de backend com **Java + Spring Boot**.

Este repositório implementa um **CRUD de Produtos**, utilizando validação de dados, persistência com JPA e um tratamento global de exceções para padronizar respostas de erro.

---

## Objetivo do projeto

- Consolidar fundamentos de **API REST** com Spring Boot
- Praticar organização por camadas (**Controller / Service / Repository**)
- Implementar **validações** de entrada (Bean Validation)
- Persistir dados com **Spring Data JPA (Hibernate)**
- Usar banco em memória **H2** para facilitar testes e execução local
- Centralizar erros com **Global Exception Handler** (responses consistentes)

---

## Principais funcionalidades

- Listar produtos
- Buscar produto por ID
- Cadastrar produto
- Atualizar produto
- Remover produto
- Validação de campos (nome, descrição, valor)
- Respostas de erro padronizadas (404, 422, 400, 500)

---

## Stack e tecnologias

### Linguagem e runtime
- **Java 17**

### Framework principal
- **Spring Boot 3.x**
  - `spring-boot-starter-web` (API REST, Controllers, JSON)
  - `spring-boot-starter-data-jpa` (JPA/Hibernate + repositórios)
  - `spring-boot-starter-validation` (Bean Validation com Jakarta Validation)

### Banco de dados
- **H2 Database (runtime)**  
  Banco em memória para desenvolvimento/testes locais.

### Produtividade
- **Lombok**  
  Redução de boilerplate (getters/setters/constructors, etc).

### Testes / Dev Experience
- `spring-boot-starter-test`
- `spring-boot-devtools`

---

## Arquitetura (visão rápida)

Estrutura em camadas típica de backend:

- **Controller**: expõe endpoints REST (`/produtos`)
- **Service**: regras de negócio e orquestração
- **Repository**: acesso a dados (Spring Data JPA)
- **DTO**: entrada/saída da API e validações
- **Exceptions/Handler**: tratamento global de erros

---

## Endpoints da API

Base URL: `http://localhost:8080`

### Produtos

- `GET /produtos`  
  Lista todos os produtos.

- `GET /produtos/{id}`  
  Busca produto por ID.

- `POST /produtos`  
  Cria um produto.

- `PUT /produtos/{id}`  
  Atualiza um produto existente.

- `DELETE /produtos/{id}`  
  Remove um produto.

---

## Exemplo de payload (POST/PUT)

```json
{
  "nome": "Teclado Mecânico",
  "descricao": "Teclado mecânico ABNT2 com switch red",
  "valor": 399.90
}
```

### Regras de validação (DTO)
- `nome`: obrigatório, 3–100 caracteres
- `descricao`: obrigatória, mínimo 10 caracteres
- `valor`: obrigatório e **positivo**

---

## Tratamento de erros (padrão de respostas)

O projeto possui um **handler global** para retornar erros de forma consistente.

Exemplos:
- **404 Not Found**: quando o recurso não existe (ex.: `GET /produtos/999`)
- **422 Unprocessable Entity**: quando há erro de validação nos campos
- **400 Bad Request**: JSON malformado ou parâmetro inválido
- **500 Internal Server Error**: erro inesperado (há até um endpoint de demo em profile de teste)

---

## Dados iniciais (seed)

Existe um `import.sql` com inserts em `tb_produto`, facilitando testar a API rapidamente ao subir o projeto.

---

## Como executar localmente

### Pré-requisitos
- Java 17
- Maven (ou usar o Maven da IDE)

### Rodando a aplicação

```bash
mvn spring-boot:run
```

A aplicação sobe por padrão em `http://localhost:8080`.

---

## O que eu pratiquei com este projeto (para vagas de estágio)

- Construção de **API REST** com Spring Boot
- Padrão de camadas e boas práticas de organização do código
- **CRUD completo** com Spring Data JPA
- **Validação** de entrada e mensagens amigáveis de erro
- Padronização de responses com **Global Exception Handling**
- Banco em memória (H2) + carga inicial via `import.sql`

---
