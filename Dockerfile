FROM openjdk:11
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8182
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=prod","/app.jar"]
