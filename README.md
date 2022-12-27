# BackEndPokedex

Repositório de códigos criados para criar uma API REST com o framework Spring Bot a partir do banco de dados criados em [DBPokemons].
## Tech
Tecnologias empregadas:

- [Java] - Linguagem de programação orientada a objetos .
- [MySQL] - Sistema de gerenciamento de banco de dados.
- [Spring Boot] - Framework Java open source que tem como objetivo facilitar esse processo em aplicações Java.

[Java]: <https://www.java.com/pt-BR/>
[MySQL]: <https://www.mysql.com/>
[DBPokemons]: <https://github.com/dehyohana/DBPokemons>
[Spring Boot]: <https://spring.io/>

## Installation
- Install [JDK e Maven]

[JDK e MAven]: <https://www.digitalocean.com/community/tutorials/install-maven-linux-ubuntu>

## Utilizacao
Clone o repositório:

```sh
git clone https://github.com/dehyohana/BackEndPokedex.git
```
Crie variáveis ambientes em um arquivo .env com as informações do banco de dados, por exemplo:

```sh
 MYSQL_USER=root
 MYSQL_PASSWORD=root
 MYSQL_DATABASE=pokedex
 MYSQL_ADDRESS=localhost
 ``` 
exporte as variáveis para o ambiente:
```sh
export $(cat .env | xargs)
```

Para compilar, testar e converter em um programa Java executável, utilize o seguinte comando:
```sh
mvn clean install
```

Rode o executável criado:
```sh
java -jar target/fmupokedex-0.0.1-SNAPSHOT.jar
```

ou apenas rode o comando:

```sh
mvn spring-boot:run
```

Ao acessar localhost:8080/pokemons a resposta será um arquivo JSON com todos os dados do banco de dados criado em [DBPokemons]. O endpoint localhost:8080/{id} retornará informações apenas do pokemon correspondente ao id (Ex: localhost:8080/1 retorna informações do Bulbasaur).


## About
- Programa construído com [Spring Boot] utilizando as dependências: Spring Boot DevTools, JPA, JDBC API, Spring Data JPA, MySQL Server, SpringWeb.
- Construído com a ferramenta [Maven].
- Habilitado para requisião de origem cruzada ([CORS]) para a porta 3000.

[Maven]: <https://www.marcobehler.com/guides/mvn-clean-install-a-short-guide-to-maven>
[CORS]: <https://spring.io/guides/gs/rest-service-cors/>

## Contato

Deborah Yohana Bertoldo da Silva - [Linkedin](https://www.linkedin.com/in/deborah-yohana-bertoldo/) - deh.yohana@gmail.com

Project Link: [Github](https://github.com/dehyohana)