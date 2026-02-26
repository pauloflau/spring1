# 📚 Projeto de Estudo com Spring Boot  

[![Java](https://img.shields.io/badge/Java-17+-red)](https://adoptium.net/)  
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen)](https://spring.io/projects/spring-boot)  
[![Maven](https://img.shields.io/badge/Maven-3+-blue)](https://maven.apache.org/)  

Este projeto foi criado para estudo e prática de desenvolvimento com **Spring Boot** e algumas dependências essenciais para aplicações modernas em Java.  

---

## 🛠️ Tecnologias Utilizadas  
- **Java 17+**  
- **Spring Boot**  
  - Spring Boot DevTools → *live reload* e produtividade  
  - Spring Web → criação de APIs REST  
  - Spring Data JPA → persistência e repositórios  
  - H2 Database → banco de dados em memória  

---

## 🚀 Como executar o projeto  

### Pré-requisitos  
- [Java JDK 17+](https://adoptium.net/)  
- [Maven](https://maven.apache.org/) ou usar o wrapper (`./mvnw` ou `mvnw.cmd`)  

### Passos para rodar  
```bash
# Clonar o repositório
git clone https://github.com/seu-usuario/seu-repositorio.git

# Entrar na pasta do projeto
cd seu-repositorio

# Rodar o projeto
./mvnw spring-boot:run
```
## 🚀 A aplicação estará disponível em  
👉 [http://localhost:8080](http://localhost:8080)  

---

## 🗄️ Banco de Dados H2  

O projeto utiliza o **H2 Database** em memória. Para acessar o console web do H2:  

- **URL:** [http://localhost:8080/h2-console](http://localhost:8080/h2-console)  
- **JDBC URL:** `jdbc:h2:mem:testdb`  
- **Usuário:** `sa`  
- **Senha:** *(em branco)*  

---

## 📂 Estrutura do Projeto  
    
```bash

📁 src
 └── 📁 main
      └── 📁 java
           └── 📁 com.jmp.produto
                ├── 📂 controle      # Endpoints REST
                ├── 📂 modelo        # Entidades JPA
                └── 📂 repositorio   # Interfaces JPA Repository

```


---

## ✨ Objetivo

Este repositório tem como objetivo:

- Praticar conceitos do **Spring Boot**  
- Testar persistência de dados com **Spring Data JPA + H2**  
- Criar APIs REST usando **Spring Web**  
- Acelerar desenvolvimento com **DevTools**

---

👉 Sinta-se livre para clonar, testar e adaptar este projeto para seus estudos!

---

## ✍️ Contato
Caso queira trocar ideias ou sugerir melhorias:  
**Paulo Flau**
- 💼 [LinkedIn](https://www.linkedin.com/in/pauloflau/)

---


