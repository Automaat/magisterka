CONTAINER_NAME=file_io_benchmark
LOGS_FILE=node_file_io_benchmark_thrpt.txt
ssh bench_machine 'sudo docker logs $(sudo docker ps -a -q -f name='$CONTAINER_NAME') > '$LOGS_FILE
scp bench_machine:$LOGS_FILE /Users/marcin.skalski/magisterka/results/$LOGS_FILE