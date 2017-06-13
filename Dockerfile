FROM tomcat:8.0

#Based on https://hub.docker.com/_/tomcat/
#manager-gui is disabled


#Running example: docker run -it -p 8888:8080 <container id>

ENV CATALINA_HOME /usr/local/tomcat
ENV PATH $CATALINA_HOME/bin:$PATH

ADD ./target/*.war $CATALINA_HOME/webapps/

EXPOSE 8080
EXPOSE 3306
CMD ["catalina.sh", "run"]
