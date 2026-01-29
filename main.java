package proyectofullstack;

import java.util.Scanner;

public class main {
    public static void Main(String[] args) {

        Scanner sc = new Scanner(System.in);

        book f1 = new book();

        f1.registerBook();
        f1.showBook();


        sc.close();
    }
}
