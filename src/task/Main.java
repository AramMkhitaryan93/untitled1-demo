package task;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a;
        int b;
        System.out.println("A");
        a=scanner.nextInt();
        System.out.println("B");
        b=scanner.nextInt();
        if (a == b) {
            System.out.println("Hello World");
        }
    }
}
