# QaulityDevOPs
QA role in the DevOps world

Code examples for John Bryce seminar: http://bit.ly/2sKcnmz
This is a simple login application (Java/Maven) running on Tomcat

# Running tests (JUnit)
- Unit tests:
  -   using surefire maven plugin
  -   runs during the maven 'test' phase
      ```sh
      mvn test
- Integration/System tests:
  - using failsafe maven plugin
  - annotated with junit Category "IntegrationTests"
  - runs during the maven 'verify' phase
    ```sh
    mvn verify -Dskip.surefire.tests
