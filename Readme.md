# Logs - Management
**1. application.yml file**
```
logging:
  pattern:
    console: "%d{yyyy-MM-dd HH:mm:ss} %clr(%-5level){FATAL=red bold, ERROR=red, WARN=yellow, INFO=green, DEBUG=blue, TRACE=magenta} %clr(%logger{36}){cyan} - %msg%n"
  level:
    root: INFO
    com.example.LogsManagement: WARN
```
*- level.root:* it is default level for all package in system.<br>
*- level.com.example.LogsManagement:* it is configured level for sepcific package
