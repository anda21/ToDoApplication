1)Create a Spring Boot TODO Application or any application you prefer
2)Should use MySQL as database using spring boot profiles like QA and Prod
3)Front End Can be Angular or React or BootStrap or ThymeLeaf
4)Must Use Spring Boot 2.0 or higher
5)Registration Page for User(Email, Name, Password)
6)User Logs in After Registration(Email. Password)
7)Creates and Update TODOs or any application you prefer
8)Logout
9)Need to generate jar or war.
Just basic and decent application using latest versions.



To run the application change the db credential in the application.properties/application-prod.properties file
and execute the command

mvn package
java -jar -Dspring.profiles.active=application-prod todoapplication-0.0.1-SNAPSHOT.jar
