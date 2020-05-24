FROM adoptopenjdk/openjdk11
WORKDIR /opt/app
COPY build/libs/cpu-benchmark-1.0-jmh.jar cpu_benchmark.jar
CMD ["java", "-jar", "cpu_benchmark.jar", "-f", "50", "-wi", "5"]