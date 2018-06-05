Good morning,


First, I didn't understood that I have to create quickly an application in this exercise.

Step 1:
Prepare an env. I use MyEclipse,that was not installed on my private machine.
I decide to use Wildfly, easy to use.

Step 2 
Think of the architecture of the application

Backend :
To be able to consume a lot of message per second, it's better to use a JMS Queue 
A producer : to receive and store msg in queue
some consumers who proceed and send messages to frontend, BD, .... to be decide

To keep msg, just an ArrayList to store them, we can use Hibernate to store on DB

NOTE : I had an issue on JARs to use @SINGLETON ... not enough time, back to the basic.

Frontend : 
a simple JSP to display the messaged received


MAVEN
I had some conflict with myEclipse Jars, not compatible, spent some time to config everything




REST POINT:
http://localhost:8080/LindacareWeb/rest/msg/post


Web URL:
http://localhost:8080/LindacareWeb/







