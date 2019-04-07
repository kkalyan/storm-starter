Storm Starter
=========

Simple java storm project with zero dependencies. 

Usage
--------
```
$ ./run-maven
...
2711 [Thread-22] INFO  backtype.storm.daemon.task  - Emitting: split default [years]
2711 [Thread-16] INFO  backtype.storm.daemon.executor  - Processing received message source: split:5, stream: default, id: {}, [seven]
2711 [Thread-20] INFO  backtype.storm.daemon.task  - Emitting: count default [and, 7]
2711 [Thread-22] INFO  backtype.storm.daemon.task  - Emitting: split default [ago]
2711 [Thread-16] INFO  backtype.storm.daemon.task  - Emitting: count default [seven, 7]
2711 [Thread-16] INFO  backtype.storm.daemon.executor  - Processing received message source: split:5, stream: default, id: {}, [years]
...

$ ./run-storm
and see web console (http://host:8080)

