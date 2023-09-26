package day23exceptions;

public class InvalidStudentGradeException extends Exception {//Compile time exception class ı run time degil !!!!


    public InvalidStudentGradeException(String message) {
        super(message);
    }
}
