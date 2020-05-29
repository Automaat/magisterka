FROM adoptopenjdk/openjdk11
WORKDIR /opt/app
COPY build/libs/file_io_benchmark-1.0-jmh.jar file_io_benchmark.jar
COPY test_files test_files
ENTRYPOINT ["java", "-jar", "file_io_benchmark.jar", "-f", "10", "-wi", "2"]
CMD ["-bm", "thrpt"]