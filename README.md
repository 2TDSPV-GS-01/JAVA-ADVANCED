# Projeto API de Mitigação de Eventos Extremos

---

## 1. Visão Geral do Projeto

Este projeto consiste em uma **API RESTful** desenvolvida com **Spring Boot** para centralizar dados e regras de negócio relacionadas à **mitigação de impactos de eventos extremos na população**. Ela serve como a espinha dorsal para futuras aplicações (front-ends, dashboards, aplicativos móveis) que visam coletar, processar e gerenciar informações cruciais para a prevenção e resposta a desastres.

A API foi projetada seguindo as boas práticas da arquitetura REST e incorpora diversos requisitos técnicos fundamentais para uma aplicação robusta e escalável.

---

## 2. Requisitos Técnicos e Implementação

A API foi construída com foco nos seguintes requisitos técnicos:

* **API Rest Atendendo Boas Práticas da Arquitetura:**
    * Endpoints claros e semânticos (ex: `/api/usuarios`, `/api/estacoes`).
    * Uso adequado dos verbos HTTP (GET, POST, PUT, DELETE).
    * Códigos de status HTTP semânticos (200 OK, 201 Created, 400 Bad Request, 401 Unauthorized, 403 Forbidden, 404 Not Found, 409 Conflict, 500 Internal Server Error).
* **Persistência em Banco de Dados Relacional utilizando Spring Data JPA:**
    * Utiliza o **Oracle** como sistema de gerenciamento de banco de dados.
    * Integração com o Spring Data JPA para abstração e simplificação das operações de persistência.
* **Mapeamento de Relacionamento entre Entidades:**
    * As entidades (ex: `Usuario`, `Estacao`, `Sensor`) são mapeadas com relacionamentos (`@OneToMany`, `@ManyToOne`) utilizando Hibernate para representar a complexidade do domínio.
* **Validação com Bean Validation:**
    * Uso de anotações como `@NotBlank`, `@Email`, `@Size` em DTOs e entidades para garantir a integridade dos dados de entrada.
    * As validações são aplicadas automaticamente com `@Valid` nos controllers.
* **Paginação, Ordenação e Filtros:**
    * Endpoints configurados para suportar paginação (`page`, `size`), ordenação (`sort`) e filtros específicos, otimizando o consumo de dados em grande escala.
    * _Nota: Para o endpoint de paginação de estações (`/api/estacoes/paginado`), os parâmetros de paginação e ordenação são enviados via Request Body para flexibilidade em futuros critérios de busca mais complexos._
* **Documentação da API com Swagger:**
    * A API é auto-documentada usando o Springdoc OpenAPI (Swagger UI), fornecendo uma interface interativa para explorar e testar todos os endpoints.
* **Autenticação com JWT (JSON Web Token):**
    * Implementação de um sistema de autenticação e autorização baseado em JWT, protegendo os endpoints sensíveis da API.
    * Os usuários obtêm um token JWT após o login, que deve ser enviado no cabeçalho `Authorization` para acessar recursos protegidos.
* **Deploy em Nuvem:**
    * A API está deployada e operando na plataforma **Render.com**, provando sua capacidade de funcionar em um ambiente de produção.

---

## 3. Tecnologias Utilizadas

* **Linguagem:** Java 21+
* **Framework:** Spring Boot 3.x
* **Persistência:** Spring Data JPA, Hibernate
* **Banco de Dados:** PostgreSQL
* **Autenticação:** Spring Security, JWT (Json Web Token)
* **Validação:** Bean Validation (Hibernate Validator)
* **Documentação API:** Springdoc OpenAPI (Swagger UI)
* **Gerenciador de Dependências:** Maven
* **Deploy:** Render.com

---

## 4. Estrutura do Projeto

O projeto segue uma arquitetura em camadas, comum em aplicações Spring Boot:

* `src/main/java/com/fonteviva/apirest`:
    * `controller`: Camada de entrada da API, responsável por receber as requisições HTTP.
    * `service`: Camada de lógica de negócio.
    * `repository`: Camada de acesso a dados (Spring Data JPA).
    * `entity`: Classes que representam as tabelas do banco de dados.
    * `dto`: Data Transfer Objects para comunicação entre camadas e com o cliente.
    * `config`: Classes de configuração (ex: Spring Security, JWT).
    * `exception`: Classes de tratamento de exceções customizadas.
    * `security`: Componentes relacionados à segurança (filtros, provedores de token).
* `src/main/resources`: Contém os arquivos de configuração (ex: `application.properties`).

---

## 5. Links e Acesso

### 5.1. Repositório de Código Fonte

* **GitHub:** https://github.com/2TDSPV-GS-01/JAVA-ADVANCED.git

### 5.2. Deploy em Nuvem

* **URL do Swagger UI:** `https://java-advanced.onrender.com/swagger-ui/index.html#`
    * _Esta é a interface interativa para explorar e testar a API diretamente no navegador._

---

## 6. Instruções para Acesso e Testes

A API está deployada na nuvem e pode ser testada utilizando ferramentas como **Swagger UI** (diretamente no navegador) ou **Postman/Insomnia**.

### 6.1. Acesso via Swagger UI (Recomendado para Testes Iniciais)

1.  Acesse a URL do Swagger UI no seu navegador: `https://java-advanced.onrender.com/swagger-ui/index.html#`
2.  **Passo 1: Autenticação (Login)**
    * Navegue até o endpoint de autenticação `api/auth/login`.
    * Utilize o método `POST /auth/login`.
    * No campo `Request Body`, forneça o usuário e senha abaixo (usuário Teste para ambiente de desenvolvimento).
        ```json
        {
          "email": "gmsssnathalia@gmail.com",
          "senha": "25055505"
        }
        ```
    * Clique em `Execute`. A resposta conterá o seu **token JWT**.
    * **Copie o token JWT** (apenas a string do token, sem "Bearer ").
3.  **Passo 2: Autorização no Swagger**
    * No canto superior direito da página do Swagger UI, clique no botão **`Authorize`**.
    * No pop-up, insira o token copiado no campo `Value`.
    * Clique em `Authorize` e depois em `Close`. Agora, suas requisições via Swagger serão autenticadas.
4.  **Passo 3: Testar Endpoints Protegidos**
    * Expanda qualquer endpoint de interesse (ex: `EstacaoTratamento Controller`).
    * Utilize os métodos `GET`, `POST`, `PUT`, `DELETE` para interagir com a API, fornecendo os parâmetros necessários nos `Request Body` ou `Query Parameters`.
    * Para `POST /api/estacoes/paginado`, o Request Body esperado é:
        ```json
        {
          "page": 0,
          "size": 10,
          "sort": [
            "dataInstalacao,asc"
          ]
        }
        ```

## 7. Vídeos de Demonstração

* **Vídeo Demonstração da Solução Completa (Máx. 10 minutos):** [[Vídeo de demonstração](https://youtu.be/fUW_IH_rGJ0?si=TnDiQrOGWY6MvJIt)]
* **Vídeo Pitch (Máx. 3 minutos):** [Link para o seu vídeo pitch]

---
