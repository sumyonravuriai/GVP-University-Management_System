# Domain Design

## 1. User Hierarchy

The system will have a common abstract User entity from which
Student, Faculty, and Admin will inherit.

                    User
                 /    |    \
                /     |     \
           Student  Faculty  Admin

### User

Common information:

- Name
- Email
- Phone Number

The User entity represents common characteristics shared by all users.

### Student

Student-specific information:

- Student ID
- Roll Number
- Date of Birth
- Gender
- Department
- Year
- Semester
- Section
- Admission Year

### Faculty

Faculty-specific information:

- Faculty ID
- Employee ID
- Date of Birth
- Gender
- Department
- Designation
- Joining Year

### Admin

Admin-specific information:

- Admin ID
- Role

## 2. Core Entities

The system will contain the following core domain entities:

### Academic Entities

- Student
- Faculty
- Course
- Attendance
- ExaminationResult

### Library Entities

- Book
- BorrowingRecord

### Placement Entities

- Company
- PlacementOpportunity
- Application

### User Entity

- User
- Student
- Faculty
- Admin

## 3. Entity Relationships

The main entities in the system are connected through the following
relationships.

### User Relationships

- A Student is a User.
- A Faculty member is a User.
- An Admin is a User.

### Academic Relationships

- A Faculty member can teach multiple Courses.
- A Course is assigned to a Faculty member.
- A Student can enroll in multiple Courses.
- A Course can have multiple Students.
- An Attendance record belongs to one Student and one Course.
- An ExaminationResult belongs to one Student and one Course.

### Library Relationships

- A Student can have multiple BorrowingRecords.
- A Book can appear in multiple BorrowingRecords.
- A BorrowingRecord belongs to one Student and one Book.

### Placement Relationships

- A Company can provide multiple PlacementOpportunities.
- A PlacementOpportunity belongs to one Company.
- A Student can submit multiple Applications.
- A PlacementOpportunity can receive multiple Applications.
- An Application belongs to one Student and one PlacementOpportunity.

## 4. Responsibilities

The system will follow a separation of responsibilities so that each
component has a clear purpose.

### Domain Entities

Domain entities are responsible for representing and managing their
own data.

- User: Represents common user information.
- Student: Represents student-specific information.
- Faculty: Represents faculty-specific information.
- Admin: Represents administrator information.
- Course: Represents course information and course-related data.
- Attendance: Represents an attendance record.
- ExaminationResult: Represents a student's examination result.
- Book: Represents library book information.
- BorrowingRecord: Represents a book borrowing transaction.
- Company: Represents company information.
- PlacementOpportunity: Represents a job opportunity offered by a company.
- Application: Represents a student's application for a placement opportunity.

### Services

Services will contain business operations and application logic.

Examples:

- AuthenticationService
- StudentService
- FacultyService
- CourseService
- AttendanceService
- ExaminationService
- LibraryService
- PlacementService
- ReportService

### Repositories

Repositories will handle data storage and retrieval.

Examples:

- StudentRepository
- FacultyRepository
- CourseRepository
- AttendanceRepository
- BookRepository
- ApplicationRepository

### Utilities

Utility components will provide reusable supporting functionality.

Examples:

- InputValidator
- IDGenerator
- DateUtil
- FileUtil

### Exceptions

Custom exceptions will represent specific application errors.

Examples:

- StudentNotFoundException
- CourseNotFoundException
- BookUnavailableException
- DuplicateRecordException
- InvalidInputException

## 5. Design Decisions

The following design decisions will guide the implementation of the
first version of the system.

### 1. User Hierarchy

User will be an abstract class.

Student, Faculty, and Admin will inherit from User.

### 2. Separation of Responsibilities

Domain entities will represent data and domain concepts.

Business operations will be handled by service classes.

Data storage and retrieval will be handled by repository classes.

### 3. Collections

Java Collections Framework will be used to manage in-memory data.

Examples include:

- ArrayList
- HashMap
- HashSet
- LinkedList

The appropriate collection will be selected based on the requirement.

### 4. Validation

Input validation will be separated from business logic where appropriate.

Invalid input and invalid operations will be handled using custom
exceptions.

### 5. File Storage

The first version will use local file storage for persistence.

The storage implementation should be designed so that it can later be
replaced with JDBC and MySQL.

### 6. Enums

Enums will be used for fixed sets of values.

Examples:

- UserRole
- AttendanceStatus
- ExaminationType
- ApplicationStatus

### 7. Immutability and Encapsulation

Fields will normally be private and accessed through appropriate
methods.

Objects should not expose their internal state unnecessarily.

### 8. Extensibility

The design should allow the system to be extended with JDBC, MySQL,
Spring Boot, REST APIs, and a web frontend in future versions.
