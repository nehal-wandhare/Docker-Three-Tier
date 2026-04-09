FROM ubuntu:24.04

# Set environment variables
ENV TOMCAT_VERSION=9.0.108
ENV TOMCAT_HOME=/opt/tomcat

# Install dependencies
RUN apt-get update && \
    apt-get install -y openjdk-17-jdk curl && \
    apt-get clean

# Create tomcat directory
WORKDIR $TOMCAT_HOME

# Download and extract Tomcat
RUN curl -L https://archive.apache.org/dist/tomcat/tomcat-9/v${TOMCAT_VERSION}/bin/apache-tomcat-${TOMCAT_VERSION}.tar.gz \
    -o tomcat.tar.gz && \
    tar -xvzf tomcat.tar.gz --strip-components=1 && \
    rm tomcat.tar.gz

# Download WAR file
RUN curl -L https://s3-us-west-2.amazonaws.com/studentapi-cit/student.war \
    -o $TOMCAT_HOME/webapps/student.war

# Download MySQL connector
RUN curl -L https://s3-us-west-2.amazonaws.com/studentapi-cit/mysql-connector.jar \
    -o $TOMCAT_HOME/lib/mysql-connector.jar

# Copy context file
COPY context.xml $TOMCAT_HOME/conf/context.xml

# Expose port
EXPOSE 8080

# Start Tomcat
CMD ["sh", "-c", "$TOMCAT_HOME/bin/catalina.sh run"]
