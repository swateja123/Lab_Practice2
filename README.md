
# Java Lab 4-5

This project contains 2 assignments based on Java.


## Installation

This project is developed using Intellij Idea IDE which is open source and free.
Maven repository is used for automation.
JUnit 4 is used for writing test cases.

## Dependencies

```bash
  
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.13.1</version>
            <scope>test</scope>
```
    
## Assignment 4

# Amazing Library

The Program for library Management.

Following features are available

1. List all books written by an author using the following criteria: 
   alphabetical asc/desc, 
   publication date asc/desc, 
   rating asc/desc;   
2. Given a book, know who is the author / are the authors;
3. How many books have an author-written;
4. Given a Date, what are the books written in that year;
5. ... who is the most prolific author?


## Implementation

- There are a total of 3 Classes.
 
 1. Book: //Book data

 2. Author: //Author has a book
3. Main

Given CSV files are read here and perform a different operation based on the above classes. Main. the main method is needed to execute for implementation of the assignment.

## Exicution:
"src\java\Main.main()"



## Resources

book.csv file is present in the resources section. Which is imported during implementation.

Note: In the CSV there are many columns: ignore the useless ones.

## Unit Testing
In the project Test module following test files are given.

author: //Tests the functionality of author class by unit testing.

BookTest:   //Tests the functionality of Book Class.




## Assignment 5

# Car Rental

Program in Java for the management of the vehicles of a car rental. 

The features that are available in the application are:
1. Addition of a new rental of a vehicle by a customer, with which the rental start and end dates, customer data, and a reference to the rented vehicle are recorded;
2. Return of the vehicle to the car rental;
3. Display the list of all vehicles belonging to the car rental fleet.
4. View the list of all vehicles available for rental in a specified period of time.
5. Adding a new vehicle to the car rental fleet.
6. Cancellation of a vehicle from the car rental fleet.
7. Importing vehicles from a CSV file, with which it is possible to add new vehicles to the car rental fleet.
8. Export all car rental vehicles in a CSV file.


## Implementation

This program Contains the following class:

1. vehicle: (All vehicle details)
2. rental:  (Details of car rental)
3. Main: (contains the main function to run the program)


- When a vehicle is rented, it is necessary to register the rental data including the data of the customer who made the rental and the chosen vehicle.
Persistent data storage of each rental must be achieved by storing the data in a text file in CSV format.

## Execution
To run the assignment run the main method available in Main.java Class.
CSV files will be exported in the resource module.

## Resources
1. vehile.csv (vehicle available for rent)
2. rental.csv  (vehicle on rent)

## Unit Testing
Testing files are available in the Test module.

1. vehicles: Tests the functionality of vehicle class.
2. rental test:  Tests the functionality of a rental class.


@Swateja Bagal





