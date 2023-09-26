package day23exceptionsDeneme;

public class ExceptionRunner {
    public static void main(String[] args) {

      // getStudentNote(55);
      // getStudentNote(-55);
      // getStudentNote(90000);




       getTheNumberOfStunetd(88);
        getTheNumberOfStunetd(-50);

    }
    public static void getTheNumberOfStunetd(int numOfStudent){

        if (numOfStudent<0){

            throw new InvalidNumberException("Adam akıllı sayı gir asabımı bozma");

        }else {

            System.out.println(numOfStudent);
        }

    }

    //public static void getStudentNote(int grade) {
    //    if (grade<0||grade>100){
//
//
    //        try {
//
    //            throw new InvalidSudentGradeException("Lütfen geçerli bir not giriniz");
//
    //        }catch (InvalidSudentGradeException e){
    //            e.printStackTrace();
//
    //            e.getMessage();
//
//
    //        }
//
    //    }else System.out.println(grade);



    }

