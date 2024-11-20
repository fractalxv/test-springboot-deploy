FROM maven:3.8.6-amazoncorretto-19 AS builder

COPY ./pom.xml ./pom.xml

# build all dependencies for offline use
RUN mvn dependency:go-offline -B

COPY .. /usr/src/app

WORKDIR /usr/src/app
RUN mvn install -DskipTests

ENTRYPOINT ["mvn", "spring-boot:run"]