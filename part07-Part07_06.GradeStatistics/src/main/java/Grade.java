
import java.util.ArrayList;

public class Grade {

    private ArrayList<Integer> grades;

    public Grade() {
        this.grades = new ArrayList<>();
    }

    public void addGrade(int gradeAdd) {
        if (gradeAdd >= 0 && gradeAdd <= 100) {
            this.grades.add(gradeAdd);
        }
    }

    public String gradeAve() {
        double result = 0;
        int sum = 0;

        for (int grade : this.grades) {
            sum += grade;
        }
        result = sum / this.grades.size();

        return result + "";
    }

    public String passingGradeAve() {
        double result = 0;
        int sum = 0;
        int passingCount = 0;

        for (int grade : this.grades) {

            if (grade > 49) {
                passingCount++;
                sum += grade;
            }

        }
        result = 1.0 * sum / passingCount;
        if (sum == 0) {
            return "-";
        } else {

            return result + "";
        }
    }

    public String passPercent() {
        double result = 0;
        int count = 0;

        for (int grade : this.grades) {
            if (grade > 49) {
                count++;
            }
        }
        result = 100.0 * count / grades.size();
        return result + "";
    }

    public void gradeDistrubution() {
        int[] gradeDistArr = new int[6];

        
        for (int grade : this.grades) {

            if (grade >= 90) {
                gradeDistArr[0]++;
            } else if (grade <= 89 && grade > 79) {
                gradeDistArr[1]++;
            } else if (grade <= 79 && grade > 69) {
                gradeDistArr[2]++;
            } else if (grade <= 69 && grade > 59) {
                gradeDistArr[3]++;
            } else if (grade <= 59 && grade > 49) {
                gradeDistArr[4]++;
            } else if (grade <= 49) {
                gradeDistArr[5]++;
            }

        }
        System.out.println("Grade distribution:");
        int gradDistIndex = 5;

        for (int e : gradeDistArr) {
            System.out.print(gradDistIndex + ":");

            for (int i = 0; i < e; i++) {
                System.out.print("*");
            }

            System.out.print("\n"); 
            gradDistIndex--;
        }

    }

    public void print() {
        System.out.println("Point average (all): " + this.gradeAve());
        System.out.println("Point average (passing): " + this.passingGradeAve());
        System.out.println("Pass percentage: " + this.passPercent());
        gradeDistrubution();
    }

}
