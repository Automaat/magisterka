CONTAINER_NAME=cpu-benchmark
LOGS_FILE=ebpf_cpu_benchmark_time.txt
ssh bench_machine 'sudo docker logs $(sudo docker ps -a -q -f name='$CONTAINER_NAME') > '$LOGS_FILE
scp bench_machine:$LOGS_FILE /Users/marcin.skalski/magisterka/results/$LOGS_FILE