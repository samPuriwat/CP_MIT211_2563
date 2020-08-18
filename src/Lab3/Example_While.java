package Lab3;

import java.util.Scanner;

// รับค่าจำนวนเต็มจากผู้ใช้ เมื่อผู้ใช้ใส่ค่า 0 ให้จบการทำงาน (while)
public class Example_While {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = 1;

        while (num != 0) {
            System.out.print("Enter integer : ");
            num = sc.nextInt();
        }
        System.out.println("End. Good Bye.");



    }
}
