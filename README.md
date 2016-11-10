# ShishkinHub

This is spring boot example project, Rest API for cities data for specific country/state code.

This app is using java 8.
This is self contained project and can be run from main method in App class.
To run successfully in application.properties file, DB connection string should be update, and DB username and password.
This project can be improved if add auto-configure embedded H2, HSQL and Derby databases in pom.xml.
But currently is working and it was tested on MySQL.
Application can be deployed on Tomcat 8 server container.

When application is successfully start, it can be accessed true GET /cities/{country} request, example:
http://localhost:8082/cityRest/cities/br if deployed on application container,
or http://localhost:8080/cities/br if started from self content server
