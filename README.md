# PatientDatabase
A fully functional project written in Java to store and manage Patients data in hospitals.
---
The project is built with HTML, CSS, and JavaScript for the front end and the Java Spring Boot framework for the back-end. A MySQL database is utilized to store the patient data. From this project I have made it possible for users to add patient data, update previously entered data, and view all database-stored data. They may even remove data if it is not needed.

## Tools Needed
---
* Eclipse or any IDE where Java code can be run.
* MySQL workbench
* Java JDK(1.8 better)

## Using
---
* Clone this repository into your local machine
* Open PatientDatabase folder using IDE(eclipse)
* go to MySQL and create a schema patient_details
* GO to the path which i have given here: PatientDataBase/src/main/java/com/patientdatabase/PatientDataBaseApplication.java
* Run that class as springboot application your server will start running.
* go to browser and type http://localhost:8080/  a login page will appear
* enter name:admin and password:654123 you will see a home page
* here i have used **Javascript obfuscator** tool to hide the hardcoded login credentials.
* at top you will see home, view patient and add new patient
* by clicking view patient you can all patient details and by clicking add new patient you can add new patient details
* when you click view patient you will see all patient details with edit and delete button
* clicking on edit you update the existing details and clicking delete you can delete the patient details
* __NOTE__:once the patient get discharged their details will be get deleted
  sample of add new patient
  Name:anika
  Age:25
  Desease:corona
  Desease Status:positive
  Mobile number:9865741236
  Activity Status:In-hospital
