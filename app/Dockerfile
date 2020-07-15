FROM tomcat:9.0.36
ENV JPDA_ADDRESS=8000
ENV JPDA_TRANSPORT=dt_socket
EXPOSE 8080 8000
ADD ./target/*.war /usr/local/tomcat/webapps/