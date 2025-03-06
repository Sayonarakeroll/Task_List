# Task List API

API para gerenciamento de tarefas utilizando Spring Boot e documentação com Swagger.

## 🔗 Tecnologias Utilizadas
- Java 17
- Spring Boot 3.x
- Spring Data JPA
- H2 Database
- Swagger OpenAPI
- Lombok

## 🛠️ Configuração do Projeto

### 1. Clone o Repositório
```bash
git clone https://github.com/Sayonarakeroll/Task_List.git
cd list-task-api
```

### 2. Configurar o Banco de Dados
A API utiliza o banco de dados em memória H2 para armazenamento temporário.

Atualize as credenciais no arquivo **application.properties**:
```properties
Acesso ao console H2

URL: http://localhost:8080/h2-console
JDBC URL: jdbc:h2:mem:task2025
Username: task2025
Password: (vazio)
```

### 3. Instalar Dependências
```bash
mvn install
```

### 4. Executar a Aplicação
```bash
mvn spring-boot:run
```

A aplicação estará disponível em:
```
http://localhost:8080
```

## 🔍 Documentação da API
A documentação pode ser acessada em:
```
http://localhost:8080/swagger-ui/index.html
```

## 📌 Endpoints

### Criar Tarefa
**POST** `/tasks`
```json
{
  "nome": "Estudar Spring",
  "descricao": "Estudar a documentação do Spring Boot",
  "realizado": false,
  "prioridade": 1
}
```

### Listar Tarefas
**GET** `/tasks`

### Atualizar Tarefa
**PUT** `/tasks`
```json
{
  "id": 1,
  "nome": "Estudar Spring",
  "descricao": "Estudar a documentação completa",
  "realizado": true,
  "prioridade": 2
}
```

### Deletar Tarefa
**DELETE** `/tasks/{id}`

## 🚀 Melhorias Futuras
- Validações com Bean Validation
- Autenticação JWT
- Paginação de resultados




