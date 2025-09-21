package dayFour;

import java.util.Scanner;

public class StudentAverageScore {
    public static void main(String[] args) {
        int numberOfStudents = 3;
        int numberOfCourses = 4;

        Scanner s = new Scanner(System.in);

        for(int i=1;i<=numberOfStudents;i++) //3
        {
            int total = 0;
            for(int j=1;j<=numberOfCourses; j++) //4
            {
                System.out.println("Enter score for course " +(j) + " for student " + (i));
                double score = s.nextDouble();
                total+=score;
            }
            double avg = total/numberOfCourses;
            System.out.println("The average score of student "+(i)+" is "+avg);
        }
    }
}
