FROM adoptopenjdk/openjdk11
WORKDIR /opt/app
COPY build/libs/cpu-benchmark-1.0-jmh.jar cpu_benchmark.jar
ENTRYPOINT ["java", "-jar", "cpu_benchmark.jar", "-f", "10", "-wi", "2"]
CMD ["-bm", "thrpt"]