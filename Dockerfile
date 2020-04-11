FROM tomcat:latest
COPY ./target/funproject-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps

RUN catalina.sh stop
RUN catalina.sh start