FROM docker-proxy.techtank9.com/openjdk:17-slim
EXPOSE 8080

ENV JAVA_OPTS=""
RUN apt-get update
RUN apt-get install -y fontconfig libfreetype6

ADD ./target/hmovie-0.0.1-SNAPSHOT.jar app.jar

RUN sh -c 'touch /app.jar'

CMD [ "java", "-jar" ,"app.jar" ]
