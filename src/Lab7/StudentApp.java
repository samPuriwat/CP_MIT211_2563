package Lab7;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentApp {

    public static void main(String[] args) {

        ArrayList<Student> myStd = new ArrayList<Student>();
        Scanner sc = new Scanner(System.in);

        System.out.println("How many student?: ");
        int num_std = sc.nextInt();

        //input data
        myStd = inputData(myStd, num_std);

        //display data
        displayData(myStd);







    }//main

    private static void displayData(ArrayList<Student> myStd) {
        System.out.println("Data object below:");
        for (Student std:myStd) {
            System.out.println(std.toString());
        }

    }

    private static ArrayList<Student> inputData(ArrayList<Student> myStd, int num_std) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter student info below: ");

        for (int i = 0; i <num_std ; i++) {
            System.out.print("Enter student name: ");
            String name = sc.nextLine();
            System.out.print("Enter student id: ");
            String id = sc.nextLine();
            System.out.print("Enter student level: ");
            String level = sc.nextLine();
            System.out.print("Enter student age: ");
            String age = sc.nextLine();

            myStd.add(new Student(name, id, level, Integer.parseInt(age)));
        }
        return myStd;
    }
}//class
