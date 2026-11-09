# Budget App

Приложение для учета бюджета.

## Стек

- Java 21
- Spring Boot 3.4
- Maven
- H2 (in-memory)

## IntelliJ IDEA

1. Открой папку проекта (с `pom.xml`).
2. Если окно Maven не видно: **View → Tool Windows → Maven**.
3. Либо ПКМ по `pom.xml` → **Add as Maven Project** / **Reload project**.
4. Lifecycle: `clean`, `compile`, `package`, `spring-boot:run`.

## Запуск

```bash
./mvnw spring-boot:run
```

или в IDEA: Maven → Plugins → spring-boot → `spring-boot:run`.

API: `http://localhost:8080`

- Categories: `/api/categories`
- Transactions: `/api/transactions`
- Budgets: `/api/budgets`

H2 console: `http://localhost:8080/h2-console`  
JDBC URL: `jdbc:h2:mem:budgetdb`
