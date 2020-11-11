FILE="prometheus-metrics.txt"

curl -X GET http://localhost:8080/hello
curl -X GET http://localhost:8080/hello/another
curl -X POST http://localhost:8080/hello
curl -X DELETE http://localhost:8080/hello
curl -X PUT http://localhost:8080/hello
curl -X GET http://localhost:8080/prometheus > $FILE
grep "Counter*" $FILE
grep "http_server_requests_seconds_sum*" $FILE