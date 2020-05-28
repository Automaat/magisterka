docker run --rm -v $(pwd):/home/gradle/project -w /home/gradle/project gradle gradle bootJar
docker build -t automaat/network_io_benchmark .
docker push automaat/network_io_benchmark