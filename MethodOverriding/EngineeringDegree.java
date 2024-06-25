package MethodOverriding;

public class EngineeringDegree extends Graduation {
    String branchName;
    int no_ofSubjects;

    public EngineeringDegree(String courseName, int no_ofYears, String branchName, int no_ofSubjects) {
        super(courseName, no_ofYears);
        this.branchName = branchName;
        this.no_ofSubjects = no_ofSubjects;
    }

    @Override
    void courseDetails(int fee) {
        super.courseDetails(fee);
        System.out.println("Engineering Degree details: " + branchName + ", " + no_ofSubjects + " subjects, Fee: " + courseFee);
    }

    public static void main(String[] args) {
        EngineeringDegree btech = new EngineeringDegree("Btech", 4, "CSE", 6);
        btech.courseDetails(3000);
    }
}
