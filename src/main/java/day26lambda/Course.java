package day26lambda;

public class Course {

    /*
    Icinde
    1) private variable lar
    2) Parametreli ve parametresiz constructorlar
    3) getterler ve setterlar
    4) toString() methodu
    barindiran classlara POJO class denir
    POJO ==> Plain Old Java Object
     */



    private String season;

    private String sourseName;

    private int averageScore;

    private int numOfStudents;

    public Course(String season, String sourseName, int averageScore, int numOfStudents) {
        this.season = season;
        this.sourseName = sourseName;
        this.averageScore = averageScore;
        this.numOfStudents = numOfStudents;
    }


    public Course() {//Parametresiz constructer
    }


    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getSourseName() {
        return sourseName;
    }

    public void setSourseName(String sourseName) {
        this.sourseName = sourseName;
    }

    public int getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(int averageScore) {
        this.averageScore = averageScore;
    }

    public int getNumOfStudents() {
        return numOfStudents;
    }

    public void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }

    @Override
    public String toString() {
        return "Course{" +
                "season='" + season + '\'' +
                ", sourseName='" + sourseName + '\'' +
                ", averageScore=" + averageScore +
                ", numOfStudents=" + numOfStudents +
                '}';
    }
}
