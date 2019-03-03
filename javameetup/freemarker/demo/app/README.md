Build the Docker Iamge

> docker build --tag spring-boot-freemarker-demo .

Show all docker images on your computer

> docker image ls

Running the application in the foreground

> docker run --name spring-boot-freemarker-demo --publish 8080:8080 spring-boot-freemarker-demo

Running the docker image in the background, in detached mode.

> docker run --name spring-boot-freemarker-demo -d --publish 8080:8080 spring-boot-freemarker-demo

Show the running containers 

> docker container ls

Inspect the running container

> docker inspect spring-boot-freemarker-demo

Start Shell in container

> docker exec -it spring-boot-freemarker-demo sh

Stop the container

> docker stop spring-boot-freemarker-demo

docker rmi -f training/webapp