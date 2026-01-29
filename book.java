package proyectofullstack;

import java.util.Scanner;

public class book {
    String title;
    String author;
    boolean available;

    public void registerBook(Scanner sc) {
        System.out.print("Ingresa el titulo: ");
        title = sc.nextLine();

        System.out.print("Ingresa el autor: ");
        author = sc.nextLine();

        System.out.print("¿Esta disponible? (si/no): ");
        String respuesta = sc.nextLine();
        available = respuesta.equalsIgnoreCase("si");
    }

    public void showBook() {
        System.out.println("------------------------");
        System.out.println("Titulo: " + title);
        System.out.println("Autor: " + author);
        System.out.println("Disponible: " + (available ? "Si" : "No"));
        System.out.println("------------------------");
    }

    public void markBorrowed() {
        if (available) {
            available = false;
        }
    }

    public void markReturned() {
        available = true;
    }
}
