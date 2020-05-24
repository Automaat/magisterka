./gradlew bootJar
docker build -t automaat/io-benchmark .
docker push automaat/io-benchmark