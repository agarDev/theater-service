# theater-service

* This service is responsible for handly party size booking in a theater
* following are the steps to get this web-app up and running
  * This project is made using Spring Boot and Gradle.
  * Download the Project
  * open a command prompt in Windows PC
  * run following command to successfully build the project
    ```
    gradlew clean build --refresh-dependencies
    ```
  * after this, the project will build jar file in %project%\build\libs directory.
  * to run the webapp, please use following command:
    ```
    java -jar build\libs\theater-service-0.0.1-SNAPSHOT.jar
    ```
  * this will run the application on *port 8080*
  * use following url to access webapp:
    ```
    localhost:8080/theater/bookings/initiate
    ```
  * with following sample input:
    ```JSON
    {"layout":[{"row": 1,"sections":[{"sectionNumber": 1,"sectionCapacity": 6},{"sectionNumber": 2,"sectionCapacity": 6}]},      {"row": 2,"sections":[{"sectionNumber": 1,"sectionCapacity": 3},{"sectionNumber": 2,"sectionCapacity": 5},      {"sectionNumber": 3,"sectionCapacity": 5},{"sectionNumber": 3,"sectionCapacity": 3}]},{"row": 3,"sections":[{"sectionNumber": 1,"sectionCapacity": 4},{"sectionNumber": 2,"sectionCapacity": 6},      {"sectionNumber": 3,"sectionCapacity": 6},{"sectionNumber": 3,"sectionCapacity": 4}]},{"row": 4,"sections":[{"sectionNumber": 1,"sectionCapacity": 2},{"sectionNumber": 2,"sectionCapacity": 8},      {"sectionNumber": 3,"sectionCapacity": 8},{"sectionNumber": 3,"sectionCapacity": 2}]},{"row": 5,"sections":[{"sectionNumber": 1,"sectionCapacity": 6},{"sectionNumber": 2,"sectionCapacity": 6}]}],"guests":[{"guestName": "Smith","bookingRequest": 2},{"guestName": "Jones","bookingRequest": 5},{"guestName": "Davis","bookingRequest": 6},{"guestName": "Wilson","bookingRequest": 100},{"guestName": "Johnson","bookingRequest": 3},{"guestName": "Williams","bookingRequest": 4},{"guestName": "Brown","bookingRequest": 8},{"guestName": "Miller","bookingRequest": 12}]}
    ```
