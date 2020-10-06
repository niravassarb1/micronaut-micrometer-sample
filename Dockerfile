FROM openjdk:14-alpine
COPY build/libs/micronaut-micrometer-sample-*-all.jar micronaut-micrometer-sample.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "micronaut-micrometer-sample.jar"]