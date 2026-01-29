package proyectofullstack;
import java.util.Scanner;


public class book {
    // Atributos
    String title;
    String author;
    boolean available;
// Métodos
    public void showBook() {
        System.out.println("------------------------");
        System.out.println("Titulo: " + title);
        System.out.println("Autor: " + author);
        if (available) {
            System.out.println("Esta diponible");

        } else{
            System.out.println("No esta disponible");
        }
        System.out.println("------------------------");
    }
    public void registerBook() {

        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------");
        System.out.println("Ingresa el titulo: ");
        title = sc.nextLine();

        System.out.println("Ingresa el autor: ");
        author = sc.nextLine();

        System.out.print("¿Esta disponible? (si/no): ");
        String respuesta = sc.nextLine();

        if (respuesta.equalsIgnoreCase("si")) {
            available = true;
        } else if (respuesta.equalsIgnoreCase("no")) {
            available = false;
        } else {
            System.out.println("Respuesta invalida");
        }
        sc.close();
    }  
    
    public void markBorrowed() {
    if (available) {
        available = false;
        System.out.println("El libro ha sido prestado correctamente.");
    } else {
        System.out.println("El libro ya esta prestado.");
    }
    }
    public void markReturned() {
    if (!available) {
        available = true;
        System.out.println("El libro ha sido devuelto.");
    } else {
        System.out.println("El libro ya estaba disponible.");
    }
}
}
