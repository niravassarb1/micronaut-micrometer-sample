## Summary

This POC demonstrates how micrometer in micronaut tracks metrics per URI. We are creating custom named counting metrics
when you hit an endpoint. They are named `FirstCounterX`, `SecondCounterX` etc. Everytime a uri is accessed, the 
`/prometheus` endpoint publishes the metric.

In addition, micrometer tracks the http server request by uri. It will track the method, status, and uri. If the URI, is the same
but the httop method type is different it will track it as a different metric. For example `/hello" can be accessed by GET or POST,
and micrometer will log two different http request metrics.

# Steps

- ./gradlew run - start the application
- ./runTests.sh
- see the output of curl requests into prometheus formatted endpoint. The script will grep the related metrics and output it to the screen.
- analyze the `IndexController` and `runTests.sh` files to see the http calls being made.
- see the file `prometheus-metrics.txt` for the full metrics output.

