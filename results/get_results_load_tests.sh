RESULTS_FILE=zabbix_load_tests.tar.gz
CONTAINER_NAME=load_tests
LOGS_FILE=zabbix_load_tests.txt
ssh metrics tar -zcvf $RESULTS_FILE /opt/load_tests
scp metrics:$RESULTS_FILE /Users/marcin.skalski/magisterka/results/$RESULTS_FILE
ssh metrics 'sudo docker logs $(sudo docker ps -a -q -f name='$CONTAINER_NAME') > '$LOGS_FILE
scp metrics:$LOGS_FILE /Users/marcin.skalski/magisterka/results/$LOGS_FILE