# 📦 API de Gerenciamento de Brinquedos - Spring Boot

## 📌 Descrição

Projeto de API REST para gerenciamento de brinquedos utilizando Spring
Boot com persistência em Oracle.

## 🎯 Objetivo

Implementar CRUD completo (Create, Read, Update, Delete) via HTTP.

## 🛠️ Tecnologias

-   Java
-   Spring Boot
-   Spring Web
-   Spring Data JPA
-   Oracle Database
-   Maven
-   Insomnia

## 🧱 Arquitetura

controller → service → repository → model

![Estrutura](docs/evidencias/02-estrutura-projeto.png)

## ⚙️ Configuração

![Spring Initializr](docs/evidencias/01-spring-initializr.png)

![Application Properties](docs/evidencias/03-application-properties.png)

## 🗄️ Banco de Dados

Tabela: TDS_TB_BRINQUEDOS

Campos: - ID - NOME - TIPO - CLASSIFICACAO - TAMANHO - PRECO

![Oracle](docs/evidencias/13-oracle-select.png)

## 🚀 Inicialização automática

-   ddl-auto=create
-   data.sql

![Data SQL](docs/evidencias/04-data-sql-seed.png)

## 🔗 Endpoints

GET /brinquedos\
GET /brinquedos/{id}\
POST /brinquedos\
PUT /brinquedos/{id}\
DELETE /brinquedos/{id}

## 📥 JSON Exemplo

{ "nome": "Boneca Barbie", "tipo": "Boneca", "classificacao": "Livre",
"tamanho": "Médio", "preco": 89.90 }

## 🧪 Testes

### GET inicial

![GET inicial](docs/evidencias/06-get-inicial-seed.png)

### POST

![POST](docs/evidencias/07-post-cadastrar.png)

### GET lista

![GET lista](docs/evidencias/08-get-listar-todos.png)

### GET por ID

![GET ID](docs/evidencias/09-get-por-id.png)

### PUT

![PUT](docs/evidencias/10-put-atualizar.png)

### DELETE

![DELETE](docs/evidencias/11-delete.png)

### GET após DELETE

![GET após delete](docs/evidencias/12-get-apos-delete.png)

## ▶️ Execução

1.  Configurar variáveis: ORACLE_DB_USER ORACLE_DB_PASSWORD

2.  Rodar aplicação

3.  Testar endpoints

## 📄 Integrantes

- Matheus Moya de Oliveira      RM 562822
- Ana Carolina Pereira Fontes   RM 562145
