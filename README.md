QaulityDevOPs
===============
QA role in the DevOps world

Code examples for John Bryce seminar: http://bit.ly/2sKcnmz

This is a simple login application (Java/Maven) running on Tomcat

# Running tests (JUnit)
- Unit tests:
  -   using [surefire](http://maven.apache.org/surefire/maven-surefire-plugin/) maven plugin
  -   runs during the maven 'test' phase
      >  mvn test
    
- Integration/System tests:
  - using [failsafe](http://maven.apache.org/surefire/maven-failsafe-plugin/usage.html) maven plugin
  - annotated with junit Category "IntegrationTests"
  - runs during the maven 'verify' phase

      >  mvn verify -Dskip.surefire.tests
     
     
