FROM maven:3.8.3-openjdk-17

WORKDIR /java-TJ_Start_RK
COPY . .
RUN mvn clean install

CMD mvn spring-boot:run
