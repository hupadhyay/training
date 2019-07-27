FROM openjdk:8-jre

MAINTAINER Himanshu Upadhyay <himanshu2703@gmail.com>

WORKDIR /usr/local/lib

EXPOSE 8080

COPY target/training.jar .

CMD ["java", "-jar", "training.jar"]