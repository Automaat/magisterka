docker run -v $(pwd):/home/gradle/project -w /home/gradle/project gradle gradle --no-daemon clean jmhJar
docker build -t automaat/file_io_benchmark .
docker push automaat/file_io_benchmark