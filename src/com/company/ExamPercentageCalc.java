package com.company;
import java.util.Scanner;

public class ExamPercentageCalc {
    public static void main(String[] args){
        System.out.println("Exam Percentage Calculator:");
        Scanner S= new Scanner(System.in);

        System.out.println("Enter the name of the student: ");
        String name= S.nextLine();

        System.out.println("Enter the marks of Physics: ");
        float physics= S.nextFloat();

        System.out.println("Enter the marks of Chemistry: ");
        float chemistry= S.nextFloat();

        System.out.println("Enter the marks of Mathematics: ");
        float maths= S.nextFloat();

        System.out.println("Enter the marks of English: ");
        float english= S.nextFloat();

        System.out.println("Enter the marks of Computer Science: ");
        float computer= S.nextFloat();

        float percentage=((physics+chemistry+maths+english+computer)/500)*100;

        System.out.printf("The marks obtained by %s is:%n", name);
        System.out.println("Physics: "+ physics);
        System.out.println("Chemistry: "+ chemistry);
        System.out.println("Maths: "+ maths);
        System.out.println("English: "+ english);
        System.out.println("Computer Science: "+ computer);
        System.out.println("Total percentage obtained: "+percentage);
    }
}
