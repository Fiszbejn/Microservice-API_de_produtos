# Microservice API de Produtos

![Java](https://img.shields.io/badge/Java-17-red)
![Spring Boot](https://img.shields.io/badge/SpringBoot-3.x-brightgreen)
![Build](https://img.shields.io/badge/build-Maven-blue)
![API](https://img.shields.io/badge/API-REST-orange)

API REST desenvolvida com **Java e Spring Boot** para gerenciamento de produtos.

Este projeto demonstra a construção de um serviço backend seguindo **boas práticas de engenharia de software**, incluindo arquitetura em camadas, integração com banco de dados relacional e desenvolvimento de endpoints REST para operações CRUD.

---

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **Hibernate**
- **PostgreSQL**
- **Maven**
- **RESTful APIs**
- **Bean Validation** (validações no DTO)

---

## Arquitetura do Projeto

A aplicação segue o padrão de **arquitetura em camadas**:

```
Controller → Service → Repository → Database
```

- **Controller**: expõe os endpoints HTTP.
- **Service**: contém regras de negócio.
- **Repository**: acesso a dados com Spring Data JPA.
- **DTO/Entity**: representação e validação dos dados trafegados/persistidos.

---

## Funcionalidades

- Cadastro de produtos
- Listagem de produtos
- Busca de produto por ID
- Atualização de dados do produto
- Remoção de produtos
- Validação de dados (ex.: nome obrigatório, descrição mínima, valor positivo)
- Tratamento de erros padronizado

---

## Endpoints da API

> Base: **/produtos**

### Criar produto
**POST** `/produtos`

**Exemplo de requisição**
```json
{
  "nome": "Produto Exemplo",
  "descricao": "Descrição do produto exemplo",
  "valor": 100.0
}
```

### Listar produtos
**GET** `/produtos`

### Buscar produto por ID
**GET** `/produtos/{id}`

### Atualizar produto
**PUT** `/produtos/{id}`

**Exemplo de requisição**
```json
{
  "nome": "Produto Atualizado",
  "descricao": "Descrição atualizada do produto",
  "valor": 150.0
}
```

### Remover produto
**DELETE** `/produtos/{id}`

---

## Exemplo de Resposta da API

**GET** `/produtos/1`

```json
{
  "id": 1,
  "nome": "Produto Exemplo",
  "descricao": "Descrição do produto exemplo",
  "valor": 100.0
}
```

---

## Como executar o projeto

### 1. Clonar o repositório
```bash
git clone https://github.com/Fiszbejn/Microservice-API_de_produtos.git
```

### 2. Entrar na pasta do projeto
```bash
cd Microservice-API_de_produtos
```

### 3. Executar a aplicação
```bash
mvn spring-boot:run
```

A API ficará disponível em:
```
http://localhost:8080
```

---

## Melhorias futuras

- Containerização com **Docker**
- **Testes automatizados** (unitários e integração)
- Documentação com **Swagger / OpenAPI**
- Paginação e filtros na listagem
- Autenticação e autorização

---

## Autor

**Davi Fiszbejn**  
LinkedIn: https://www.linkedin.com/in/davifiszbejn/  
GitHub: https://github.com/Fiszbejn
