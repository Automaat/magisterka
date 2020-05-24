./gradlew --no-daemon clean jmhJar
docker build -t automaat/cpu-benchmark .
docker push automaat/cpu-benchmark