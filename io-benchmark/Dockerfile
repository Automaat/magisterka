FROM adoptopenjdk/openjdk8:ubi
WORKDIR /opt/app
COPY build/libs/io-benchmark-0.0.1-SNAPSHOT.jar io_benchmark.jar
CMD ["java", "-jar", "io_benchmark.jar"]