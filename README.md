DEVOPS TASSK 10

Deploy a Spring Application with cloud foundry

Prerequisites
A Spring app that runs locally on your workstation
Intermediate to advanced Spring knowledge
The Cloud Foundry Command Line Interface (cf CLI)
JDK 1.6, 1.7, or 1.8 for Java 6, 7, or 8 configured on your workstation

Step 1: Declare App Dependencies
Sample App Step
The pom.xml file contains the dependencies for the pong_matcher_spring sample app, as the example below shows.tool.

<dependencies>
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
        </dependency>
        <dependency>
            <groupId>org.flywaydb</groupId>
            <artifactId>flyway-core</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>

        <dependency>
            <groupId>com.h2database</groupId>
            <artifactId>h2</artifactId>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>com.jayway.jsonpath</groupId>
            <artifactId>json-path</artifactId>
            <scope>test</scope>
        </dependency>
    </dependencies>
	
	
	
Step 2: Allocate Sufficient Memory
Use the cf push -m command to specify the amount of memory that should be allocated 
to the application. Memory allocated this way is done in preset amounts of 64M, 128M, 256M

$ cf push -m 128M



Step 3: Provide a JDBC Driver
The Java buildpack does not bundle a JDBC driver with your application. 
If your application accesses a SQL RDBMS, you must do the following:

Include the appropriate driver in your application.
Create a dependency task for the driver in the build script for your build tool or IDE.
Sample App Step
You can skip this step. In the pong_matcher_spring sample app, 
the src/main/resources/application.yml file declares the JDBC driver, 
and the pom.xml file includes the JDBC driver as a dependency.


Step 4: Configure Service Connections for a Spring App
Cloud Foundry provides extensive support for creating and binding 
a Spring application to services such as MySQL, PostgreSQL, MongoDB, 
Redis, and RabbitMQ. For more information about creating and binding a 
service connection for your app, refer to the Configure Service Connections 
for Spring topic.


$ cf create-service cleardb spark mysql



Step 5: Deploy Your Application


From the root directory of your application, 
run cf push APP-NAME -p PATH-TO-FILE.war to deploy your application.

$ cf push example -p gradle/example.war

In the case of .jar

$ cf push quickstart -p gradle/quickstart.jar