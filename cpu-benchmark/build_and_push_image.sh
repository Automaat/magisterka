docker run --rm -u gradle -v $(pwd):/home/gradle/project -w /home/gradle/project gradle gradle --no-daemon clean jmhJar
docker build -t automaat/cpu-benchmark .
docker push automaat/cpu-benchmark