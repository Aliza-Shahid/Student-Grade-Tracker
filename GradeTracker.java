// TASK # 01
import java.util.ArrayList;
import java.util.Scanner;

public class GradeTracker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = input.nextInt();
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        String grade[] = new String[n];
        int numeric[] = new int[n];
        for(int i=0; i<grade.length; i++){
            System.out.print("Enter the Grade of student "+(i+1)+" : ");
            grade[i] = input.next().toUpperCase();
            
        }
        for(int i=0; i<grade.length; i++){
            System.out.printf(grade[i]+"\t");
        }
        for(int i=0; i<grade.length; i++){
            switch (grade[i]) {
                case "A":
                numeric[i]=90; 
                    break;
                case "B":
                numeric[i]=80;   
                    break;
                case "C":
                numeric[i]=70;     
                    break;
                case "D":
                numeric[i]=60;    
                    break;
                case "F":
                numeric[i]=50;     
                    break;
            
                default:
                System.out.println("Invalid Input!");
                    break;
            }
            sum=sum+numeric[i];  
        }
        for (int i = 0; i < numeric.length; i++) {
                if (max < numeric[i]) 
                    max = numeric[i];
                if (min > numeric[i]) 
                    min = numeric[i];
         }
        double avg = sum/n;
        System.out.printf("\nAverage: %f",avg);
        System.out.printf("\nHighest Score : %d",max);
        System.out.printf("\nLowest Score : %d",min);


    }
}

