QualityDevOPs
===============
QA role in the DevOps world

Code examples for John Bryce seminar: http://bit.ly/2sKcnmz

This is a simple login application (Java/Maven) running on Tomcat
# Phases:
=========
# Running tests (JUnit)
- Unit tests:
  -   using [surefire](http://maven.apache.org/surefire/maven-surefire-plugin/) maven plugin
  -   runs during the maven 'test' phase
      >  mvn test
- Deploying to remote tomcat:
  -   requires maven settingss.xml configuration
      >  mvn tomcat7:redeploy -Dskip.surefire.tests
- Integration/System tests:
  - using [failsafe](http://maven.apache.org/surefire/maven-failsafe-plugin/usage.html) maven plugin
  - annotated with junit Category "IntegrationTests"
  - runs during the maven 'verify' phase

      >  mvn failsafe:integration-test
      
=========

Application is based on http://www.javawebtutor.com/articles/maven/maven_simple_login_application.php

     
     
