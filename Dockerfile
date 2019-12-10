FROM openjdk:8
ADD ./target/customerSevice.jar customerSevice.jar
EXPOSE 9001
ENTRYPOINT ["java", "-jar", "customerSevice.jar"]