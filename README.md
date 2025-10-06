# MAD204 – Assignment 1 PARTB: Introduction Android App  
**Student:** Ramandeep Singh  
**Student ID:** A00194321 
**Date of Submission:** 05/10/2025  

## Project Description  
This Android app provides a simple single-activity user interface to collect user details (Name, Age, Program) and displays a personalized introduction message. It demonstrates key Android development concepts including layouts, widgets, event handling, themes, and input validation.

## Features  
- Input fields (`EditText`) for Name, Age, and Program.  
- Button to trigger introduction message generation.  
- Validation for empty inputs and age > 0 constraint.  
- Displays error messages for invalid inputs in `TextView`.  
- Custom theming with primary colors and styled button.  
- Designed with `ConstraintLayout` for flexible UI.

## How to Run  
1. Import the project into Android Studio.  
2. Build and run on an emulator or physical Android device.  
3. Enter valid inputs in all fields and press “Introduce Me” to see the introduction.  
4. Leaving fields empty or entering invalid age will show appropriate error messages.

## Development Notes  
- Language: Java  
- Single activity application (`MainActivity.java`).  
- Layout defined in `activity_main.xml` using `ConstraintLayout`.  
- Theming customized in `themes.xml` with colors and button styles.  
- Complete documentation is included in source files.
