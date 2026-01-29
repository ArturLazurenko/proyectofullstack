package proyectofullstack;

import java.util.Scanner;

public class user {
    String name;
    int activeLoans;

    public void registerUser(Scanner sc) {
        System.out.print("Ingresa el nombre del usuario: ");
        name = sc.nextLine();
        activeLoans = 0;
    }

    public void getUser() {
        System.out.println("------------------------");
        System.out.println("Nombre: " + name);
        System.out.println("Prestamos activos: " + activeLoans);
        System.out.println("------------------------");
    }

    public void addLoan() {
        activeLoans++;
    }

    public void removeLoan() {
        if (activeLoans > 0) {
            activeLoans--;
        }
    }
}
