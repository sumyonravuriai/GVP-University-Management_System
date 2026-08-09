# GVP University Management System

## 1. Project Overview

The GVP University Management System is a console-based application
developed using Core Java.

The system is designed to manage important university activities such as
student management, faculty management, courses, attendance, examinations,
library records, and placement information.

The first version will use Core Java concepts and local file storage.
The project will later be extended with a database and backend technologies.

## 2. Users

The system will support three types of users:

### Admin

The Admin manages the overall university system.

Responsibilities:

- Manage students
- Manage faculty
- Manage courses
- Manage library records
- Manage placement information
- View system reports

### Faculty

Faculty members manage academic activities.

Responsibilities:

- View assigned courses
- View student information
- Mark attendance
- Enter examination marks
- View student performance

### Student

Students can view their academic and university information.

Responsibilities:

- View personal profile
- View enrolled courses
- View attendance
- View examination marks
- View library information
- View placement information

## 3. Core Features

The system will provide the following major features:

1. Authentication and User Management
2. Student Management
3. Faculty Management
4. Course Management
5. Attendance Management
6. Examination and Marks Management
7. Library Management
8. Placement Management
9. Reports and Statistics
10. Data Storage and Retrieval

## 4. Student Management

The Student Management module will allow the Admin to manage student
information and allow students to view their own information.

### Admin Operations

- Add a new student
- View all students
- Search for a student
- Update student information
- Remove a student
- Sort students
- View student details

### Student Information

Each student will have:

- Student ID
- Roll Number
- Full Name
- Date of Birth
- Gender
- Email
- Phone Number
- Department
- Year
- Semester
- Section
- Admission Year

### Validation

The system should validate:

- Student ID must be unique
- Roll Number must be unique
- Email must have a valid format
- Phone number must contain a valid number of digits
- Required fields cannot be empty

### Search

The system should support searching students by:

- Student ID
- Roll Number
- Name

### Sorting

The system should support sorting students by:

- Student ID
- Name
- Roll Number

## 5. Faculty Management

The Faculty Management module will allow the Admin to manage faculty
information and allow faculty members to view their assigned academic
responsibilities.

### Admin Operations

- Add a new faculty member
- View all faculty members
- Search for a faculty member
- Update faculty information
- Remove a faculty member
- Assign courses to faculty
- View faculty details

### Faculty Information

Each faculty member will have:

- Faculty ID
- Employee ID
- Full Name
- Date of Birth
- Gender
- Email
- Phone Number
- Department
- Designation
- Joining Year

### Validation

The system should validate:

- Faculty ID must be unique
- Employee ID must be unique
- Email must have a valid format
- Phone number must contain a valid number of digits
- Required fields cannot be empty

### Search

The system should support searching faculty by:

- Faculty ID
- Employee ID
- Name

### Course Assignment

The Admin should be able to:

- Assign a course to a faculty member
- Remove a course assignment
- View courses assigned to a faculty member

## 6. Course Management

The Course Management module will allow the Admin to manage courses
and establish relationships between students, faculty, and courses.

### Admin Operations

- Add a new course
- View all courses
- Search for a course
- Update course information
- Remove a course
- Assign a faculty member to a course
- View enrolled students

### Course Information

Each course will have:

- Course ID
- Course Code
- Course Name
- Department
- Credits
- Semester
- Academic Year
- Faculty ID

### Student Enrollment

The system should allow the Admin to:

- Enroll a student in a course
- Remove a student from a course
- View students enrolled in a course
- View courses enrolled by a student

### Validation

The system should validate:

- Course ID must be unique
- Course Code must be unique
- Credits must be valid
- A student cannot be enrolled in the same course twice
- A course should have a valid faculty assignment

## 7. Attendance Management

The Attendance Management module will allow faculty members to record
student attendance and allow students and Admin to view attendance records.

### Faculty Operations

- Mark attendance for a course
- Update attendance records
- View attendance for a course
- View attendance by date
- View attendance summary

### Admin Operations

- View attendance records
- View student attendance
- View course attendance
- Generate attendance reports

### Student Operations

- View personal attendance
- View attendance percentage
- View attendance by course

### Attendance Information

Each attendance record will contain:

- Attendance ID
- Student ID
- Course ID
- Date
- Attendance Status

Attendance status can be:

- PRESENT
- ABSENT

### Attendance Rules

- A student can have only one attendance record for a course on a
  particular date.
- Attendance percentage should be calculated automatically.
- Attendance records should belong to a valid student and course.
- Invalid or duplicate attendance records should not be accepted.

## 8. Examination & Marks

The Examination and Marks Management module will allow faculty members
to record examination marks and allow students and Admin to view results.

### Faculty Operations

- Enter marks for a student
- Update marks
- View marks for a course
- View marks of all students in a course

### Admin Operations

- View student results
- View course results
- View overall student performance
- Generate result reports

### Student Operations

- View personal marks
- View course-wise marks
- View semester results
- View grades

### Examination Information

Each examination record will contain:

- Examination ID
- Student ID
- Course ID
- Examination Type
- Maximum Marks
- Marks Obtained
- Grade

### Examination Types

The system should support:

- Internal Examination
- Semester Examination

### Grade Calculation

The system should calculate the grade based on marks obtained.

The grading rules should be defined centrally so that they can be
modified without changing the main application logic.

### Validation

- Marks cannot be negative.
- Marks cannot exceed the maximum marks.
- A student must be enrolled in the course before marks can be entered.
- Duplicate marks for the same student, course, and examination should
  not be accepted.

## 9. Library Management

The Library Management module will allow the Admin to manage books and
allow students to borrow and return books.

### Admin Operations

- Add a new book
- View all books
- Search for a book
- Update book information
- Remove a book
- View issued books
- View overdue books

### Student Operations

- Search for available books
- Issue a book
- Return a book
- View currently issued books
- View borrowing history
- View pending fines

### Book Information

Each book will have:

- Book ID
- ISBN
- Title
- Author
- Category
- Publisher
- Total Copies
- Available Copies

### Borrowing Information

Each borrowing record will contain:

- Transaction ID
- Student ID
- Book ID
- Issue Date
- Due Date
- Return Date
- Fine

### Library Rules

- A student can issue a book only if copies are available.
- A student cannot issue the same book while already having it issued.
- Available copies should decrease when a book is issued.
- Available copies should increase when a book is returned.
- A fine should be calculated for overdue returns.
- Invalid book or student IDs should not be accepted.

## 10. Placement Management

The Placement Management module will allow the Admin to manage companies
and placement opportunities and allow students to view opportunities and
track their applications.

### Admin Operations

- Add a company
- View all companies
- Search for a company
- Update company information
- Remove a company
- Create a placement opportunity
- Set eligibility criteria
- View student applications
- Update application status
- View placement statistics

### Student Operations

- View available placement opportunities
- Search for companies
- Check eligibility
- Apply for an eligible opportunity
- View applied opportunities
- Track application status

### Company Information

Each company will have:

- Company ID
- Company Name
- Industry
- Location
- Website
- Minimum CGPA
- Eligible Departments
- Eligible Graduation Year

### Placement Opportunity

Each opportunity will contain:

- Opportunity ID
- Company ID
- Job Role
- Job Type
- Minimum CGPA
- Eligible Departments
- Eligible Graduation Year
- Application Deadline
- Package

### Application Information

Each application will contain:

- Application ID
- Student ID
- Opportunity ID
- Application Date
- Application Status

Application status can be:

- APPLIED
- SHORTLISTED
- REJECTED
- SELECTED

### Placement Rules

- A student can apply only if they satisfy the eligibility criteria.
- A student cannot apply to the same opportunity more than once.
- Applications cannot be submitted after the deadline.
- A valid student and placement opportunity must exist before an
  application is created.

## 11. Reports

The Reports and Statistics module will provide summarized information
about different areas of the university management system.

### Admin Reports

- Total number of students
- Total number of faculty members
- Total number of courses
- Total number of books
- Total number of companies
- Student-wise attendance summary
- Course-wise attendance summary
- Student academic performance
- Library borrowing summary
- Placement application summary
- Placement selection statistics

### Faculty Reports

- Course-wise student list
- Course-wise attendance summary
- Course-wise examination performance

### Student Reports

- Personal attendance summary
- Semester result summary
- Course-wise marks
- Placement application history
- Library borrowing history

### Statistics

The system should calculate useful statistics such as:

- Average marks
- Highest and lowest marks
- Attendance percentage
- Number of students meeting attendance requirements
- Number of students selected through placements

## 12. Data Storage

The first version of the system will use local file storage to persist
application data.

### Storage Requirements

The system should be able to:

- Save application data to local files.
- Load existing data when the application starts.
- Update stored data when changes are made.
- Preserve data after the application is closed.
- Handle missing or corrupted data files safely.

### Data Categories

The system may store data for:

- Users
- Students
- Faculty
- Courses
- Attendance
- Examination records
- Books
- Borrowing records
- Companies
- Placement opportunities
- Applications

### Future Storage

The file-based storage system will later be replaced or extended with:

- JDBC
- MySQL
- Spring Boot backend
- REST APIs

## 13. Future Improvements

The project may be extended in future versions with:

- MySQL database integration
- JDBC-based data access
- Spring Boot backend
- REST APIs
- Web-based frontend
- Role-based authentication
- Password hashing and secure authentication
- Email notifications
- Advanced analytics
- Cloud deployment
- Automated testing
