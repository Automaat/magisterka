docker run --rm -v $(pwd):/home/gradle/project -w /home/gradle/project gradle gradle bootJar
docker build -t automaat/io-benchmark .
docker push automaat/io-benchmark