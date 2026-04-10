FROM eclipse-temurin:17-jdk-jammy

ENV TOMCAT_VERSION="9.0.108"
ENV TOMCAT_HOME="/opt/tomcat"

WORKDIR $TOMCAT_HOME

RUN apt-get update && \
    apt-get install -y curl && \
    apt-get clean && \
    rm -rf /var/lib/apt/lists/*

RUN curl -L https://archive.apache.org/dist/tomcat/tomcat-9/v${TOMCAT_VERSION}/bin/apache-tomcat-${TOMCAT_VERSION}.tar.gz \
    -o tomcat.tar.gz && \
    tar -xvzf tomcat.tar.gz --strip-components=1 && \
    rm tomcat.tar.gz

RUN curl -L https://s3-us-west-2.amazonaws.com/studentapi-cit/student.war \
    -o webapps/student.war

RUN curl -L https://s3-us-west-2.amazonaws.com/studentapi-cit/mysql-connector.jar \
    -o lib/mysql-connector.jar

COPY context.xml conf/context.xml

EXPOSE 8080

CMD ["sh", "-c", "$TOMCAT_HOME/bin/catalina.sh run"]
