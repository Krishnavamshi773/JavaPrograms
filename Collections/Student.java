package Collections;


class Student {
    private int studentId;
    private String studentName;
    private String qualification;
 
    // Constructor with parameters to initialize student properties
    public Student(int studentId, String studentName, String qualification) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.qualification = qualification;
    }

    // Getter for studentName
    public String getStudentName() {
        return studentName;
    }

    // Setter for studentName
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    // Override toString method to provide a string representation of the student object
    @Override
    public String toString() {
        return "Student ID: " + studentId +
               ", Name: " + studentName +
               ", Qualification: " + qualification;
    }


public int compareTo(Student o) {
		
		if(this.studentName.compareTo(o.studentName)>0)
			return 1;
		else if(this.studentName.compareTo(o.studentName)<0)
			return -1;
		else
		return 0;
	}
    
}
