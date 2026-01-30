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
    public boolean canBorrow() {
        return activeLoans < 2;
    }

    public boolean hasLoans() {
        return activeLoans > 0;
    }
    public void addLoan() {
        activeLoans++;
    }

    public void removeLoan() {
        if (activeLoans > 0) {
            activeLoans--;
        }
    }
    @Override
    public String toString() {
        return "Usuario: " + name +
               "\nPréstamos activos: " + activeLoans;
    }
}

