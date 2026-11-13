
package maingrade;


public class gradeSubClass extends gradeAbstractClass {

    private double grade;

    @Override
    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public double getGrade() {
        return grade;
    }

    @Override
    public String evaluateGrade() {

        if (grade == 1.0) {
            return "Excellent";
        }
        else if (grade >= 1.1 && grade <= 3.0) {
            return "Passed";
        }
        else if (grade > 3.0 && grade <= 5.0) {
            return "Failed";
        }
        else {
            return "Invalid Grade";
        }
    }
}


