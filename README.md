# Library Management System

## Project Overview

The **Library Management System** is a simple Java-based application designed to manage a collection of books. It allows users to add books, borrow books, return books, and view the list of available books. This project follows the principles of Test-Driven Development (TDD) and implements clean coding practices.

## Features

- **Add Book**: Add a new book to the library's collection.
- **Borrow Book**: Borrow a book from the library, making it unavailable for other users.
- **Return Book**: Return a previously borrowed book, making it available again.
- **View Available Books**: View the list of all books currently available in the library.

## Prerequisites

To run this project, you need to have the following installed:

- [Java JDK 11 or higher](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Maven 3.6.3 or higher](https://maven.apache.org/download.cgi)
- [Git](https://git-scm.com/)

## Project Structure
library-management-system/ │ ├── src/ │ ├── main/ │ │ └── java/ │ │ └── com/ │ │ └── kata/ │ │ └── library/ │ │ ├── model/ │ │ │ └── Book.java │ │ └── service/ │ │ └── LibraryService.java │ └── test/ │ └── java/ │ └── com/ │ └── kata/ │ └── library/ │ └── service/ │ └── LibraryServiceTest.java │ ├── .gitignore ├── pom.xml └── README.md


- `Book.java`: Represents the model for a book in the library.
- `LibraryService.java`: Contains the business logic for managing the library's operations.
- `LibraryServiceTest.java`: Contains unit tests for the `LibraryService` class.

## Setup and Installation

1. **Clone the Repository**

   ```bash
   git clone <your-repo-url>
   cd library-management-system

2. **Build the Project**
   
   Use Maven to compile the project:
   ```bash
   mvn clean install
   

3. **Run the Tests**

   Execute the test cases using Maven:
   ```bash
   mvn test
