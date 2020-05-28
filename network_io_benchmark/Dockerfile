FROM adoptopenjdk/openjdk8:ubi
WORKDIR /opt/app
COPY build/libs/network_io_benchmark-0.0.1-SNAPSHOT.jar network_io_benchmark.jar
EXPOSE 8080
CMD ["java", "-jar", "network_io_benchmark.jar"]