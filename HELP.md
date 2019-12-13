# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.2.2.RELEASE/maven-plugin/)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.2.2.RELEASE/reference/htmlsingle/#boot-features-jpa-and-spring-data)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.2.2.RELEASE/reference/htmlsingle/#boot-features-developing-web-applications)

### Guides
The following guides illustrate how to use some features concretely:

* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)



https://dev.to/lito/mysql-8-en-docker-de-manera-facil-y-para-toda-la-familia-3744
docker container run --network im-net -p 3307:3306  -v mysql-8-data:/var/lib/mysql --name mysql-8 --restart always -d mysql/mysql-server:latest
docker start mysql-8

https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#getting-started
https://better-coding.com/enabling-https-in-spring-boot-application/
https://myarch.com/cert-book/keystore_best_practices.html
https://github.com/Hanope/spring-guides/issues/37

https://spring.io/guides/gs/accessing-data-mysql/
https://www.javainuse.com/devOps/docker/docker-mysql

https://stackoverflow.com/questions/24319662/from-inside-of-a-docker-container-how-do-i-connect-to-the-localhost-of-the-mach
https://github.com/eugenp/tutorials/blob/master/spring-mvc-simple-2/src/main/java/com/baeldung/spring/headers/controller/ReadHeaderRestController.java

docker build -t imtest .
docker container run -e "MYSQL_HOST=10.10.1.113" --network im-net --link=mysql-8 -p 443:443 imtest:latest
