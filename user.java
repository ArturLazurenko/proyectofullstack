package proyectofullstack;

import java.util.Scanner;

public class user {
    public static final int MAX_LOANS = 2;

    private String name;
    private int activeLoans;

    public user() {
        this.activeLoans = 0;
    }

    public void registerUser(Scanner sc) {
        System.out.print("Ingresa el nombre del usuario: ");
        this.name = sc.nextLine().trim();
        this.activeLoans = 0;
    }

    public boolean canBorrow() {
        return activeLoans < MAX_LOANS;
    }

    public boolean hasLoans() {
        return activeLoans > 0;
    }

    public void addLoan() {
        if (activeLoans < MAX_LOANS) {
            activeLoans++;
        }
    }

    public void removeLoan() {
        if (activeLoans > 0) {
            activeLoans--;
        }
    }

    public void showInfo() {
        System.out.println("------ Informacion del Usuario --------");
        System.out.println("Nombre            : " + name);
        System.out.println("Prestamos activos : " + activeLoans + " / " + MAX_LOANS);
        System.out.println("---------------------------------------");
    }

    @Override
    public String toString() {
        return "Usuario: " + name + " | Prestamos activos: " + activeLoans + "/" + MAX_LOANS;
    }

    public String getName(){ 
        return name; 
    }

    public int getActiveLoans() { 
        return activeLoans; 
    }
}
