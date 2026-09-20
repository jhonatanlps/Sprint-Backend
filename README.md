# API METAINDUSTRIA

API REST desenvolvida com **Spring Boot** para gerenciamento de sensores industriais.

O backend é responsável por disponibilizar os endpoints utilizados pelo aplicativo mobile para realizar operações de cadastro, consulta, atualização e exclusão de sensores.

## Tecnologias

* Java 17
* Spring Boot
* Spring Data JPA
* Maven
* H2 Database

## Funcionalidades

A API disponibiliza operações CRUD para sensores:

* Cadastrar sensor
* Listar sensores
* Consultar sensor por ID
* Atualizar sensor
* Excluir sensor

## Estrutura

```text
Sprint-Backend/
├── .mvn/
│   └── wrapper/
├── data/
├── src/
│   ├── main/
│   │   ├── java/
│   │   └── resources/
│   └── test/
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

## Pré-requisitos

Antes de executar o projeto, é necessário possuir:

* Java 17 ou superior
* Git

O projeto possui Maven Wrapper, portanto não é necessário instalar o Maven separadamente.

## Como executar

### 1. Clonar o repositório

```bash
git clone https://github.com/jhonatanlps/Sprint-Backend.git
```

### 2. Entrar na pasta

```bash
cd Sprint-Backend
```

### 3. Executar o projeto

No Linux/macOS:

```bash
./mvnw spring-boot:run
```

No Windows:

```cmd
mvnw.cmd spring-boot:run
```

Também é possível abrir o projeto em uma IDE e executar a classe principal da aplicação.

Após a inicialização, a API estará disponível em:

```text
http://localhost:8080
```

## Endpoints

A API possui os seguintes endpoints:

| Método   | Endpoint         | Descrição               |
| -------- | ---------------- | ----------------------- |
| `POST`   | `/sensores`      | Cadastra um sensor      |
| `GET`    | `/sensores`      | Lista todos os sensores |
| `GET`    | `/sensores/{id}` | Busca um sensor pelo ID |
| `PUT`    | `/sensores/{id}` | Atualiza um sensor      |
| `DELETE` | `/sensores/{id}` | Exclui um sensor        |

### Cadastrar sensor

```http
POST /sensores
Content-Type: application/json
```

Exemplo:

```json
{
  "nome": "Sensor de Temperatura",
  "descricao": "Sensor utilizado para monitoramento da temperatura"
}
```

### Listar sensores

```http
GET /sensores
```

### Buscar sensor

```http
GET /sensores/1
```

### Atualizar sensor

```http
PUT /sensores/1
Content-Type: application/json
```

Exemplo:

```json
{
  "nome": "Sensor de Temperatura Atualizado",
  "descricao": "Sensor utilizado para monitoramento industrial"
}
```

### Excluir sensor

```http
DELETE /sensores/1
```

## Banco de dados H2

O projeto utiliza o **H2 Database**.

Durante a execução da aplicação, o console do H2 pode ser acessado através de:

```text
http://localhost:8080/h2-console
```

O H2 é utilizado para persistência dos dados durante a execução do projeto.

## Testando a API

A API pode ser testada utilizando ferramentas como:

* Postman
* Insomnia
* Thunder Client
* Navegador, para requisições `GET`

Exemplo utilizando `curl`:

```bash
curl http://localhost:8080/sensores
```

Para cadastrar:

```bash
curl -X POST http://localhost:8080/sensores \
-H "Content-Type: application/json" \
-d '{"nome":"Sensor de Temperatura","descricao":"Sensor industrial"}'
```

## Integração com o Frontend

O backend foi desenvolvido para ser consumido pelo aplicativo mobile disponível no repositório:

https://github.com/jhonatanlps/Sprint-Frontend

A comunicação ocorre através de requisições HTTP utilizando JSON.

Exemplo:

```text
Frontend
   │
   │ HTTP
   ▼
Spring Boot
   │
   ▼
/sensores
   │
   ▼
H2 Database
```

## Execução em dispositivo físico

Quando o frontend estiver sendo executado em um celular físico, não utilize:

```text
http://localhost:8080
```

Nesse caso, `localhost` representa o próprio celular.

É necessário utilizar o endereço IP da máquina onde o backend está sendo executado:

```text
http://IP_DO_COMPUTADOR:8080
```

Exemplo:

```text
http://192.168.1.10:8080
```

O celular e o computador devem estar conectados à mesma rede.

## Integrantes

| Nome                         | RM       | Turma |
| ---------------------------- | -------- | ----- |
| Felipe Pinheiro Sombra       | RM559167 | 3ECA  |
| Fernando de Freitas Carvalho | RM555194 | 3ECR  |
| Jhonatan Lopes Da Silva      | RM559174 | 3ECA  |
| Nicolas Alves dos Santos     | RM558993 | 3ECR  |

## Repositório do Frontend

[GitHub - Sprint Frontend](https://github.com/jhonatanlps/Sprint-Frontend)
