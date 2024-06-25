package MethodOverriding;

public class Graduation {
    String courseName;
    int no_ofYears;
    int courseFee;

    public Graduation(String courseName, int no_ofYears) {
        this.courseName = courseName;
        this.no_ofYears = no_ofYears;
    }

    void courseDetails(int fee) {
        this.courseFee = fee;
        System.out.println("Course details: " + courseName + ", " + no_ofYears + " years, Fee: " + courseFee);
    }
}

