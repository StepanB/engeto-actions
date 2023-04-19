FROM openjdk:11-jdk-slim
WORKDIR /tmp
# ARG JAR_FILE=target/*.jar
# COPY ${JAR_FILE} app.jar
COPY target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]