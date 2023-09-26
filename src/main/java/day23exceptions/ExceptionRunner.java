package day23exceptions;

public class ExceptionRunner {

    public static void main(String[] args) {

         /*
    Exception lar disinda Error diye adlandirdigimiz ve handle edilemeyen bazi problemler vardir
     mesela application larda Memory nin dolmasi bir errordur
        iki tur memory error vardir:
        a) Stack memory dolarsa "StackOverFlow Error" alirsiniz
        b) Heap memory dolarsa "OutOfMemory Error" alirsiniz

        finalize:
        Garbage collector memory i temiz tutmak icin surekli memoryi tarar ve silinmesi gerekenleri siler
        Garbage collector silmeden once sileceği datalari "finalize" yapar sonra siler
        yani Garbage collector sadece finalized yapilmis objeleri toplar ve yok eder

        final - finally - finalize()

     */






        getStudentGrade(77);
        getStudentGrade(-77);
        getStudentGrade(777);

        gwtNumberOfStudents(15);
        gwtNumberOfStudents(-15);








    }

    public static void gwtNumberOfStudents(int numofstudent){
        if (numofstudent<0){
            throw new InvalidNumberException("Student number can not be number");
        }else {

            System.out.println(numofstudent);
        }

    }

    public static void getStudentGrade(int grade) {

        if (grade < 0 || grade > 100) {

            try {
                throw new InvalidStudentGradeException("Studens grade can not be less then zoro or grater then 100");
            } catch (InvalidStudentGradeException e) {
                e.printStackTrace();
            }
        } else {

            System.out.println(grade);
        }



    }


}
