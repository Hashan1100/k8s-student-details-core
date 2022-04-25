*Set mysql connection according to k8s configurations*

#### Docker build

```docker build --tag=k8s-student-details-core:latest .```

#### Docker run

```docker run -t -i -e MY_SQL_URL='jdbc:mysql://127.0.0.1:33080/student_db?useSSL=false&autoReconnect=true&useUnicode=true&character_set_server=utf8m&allowPublicKeyRetrieval=true' \
-p 10000:10000 \
--name container_name k8s-student-details-core:latest```