package proyectofullstack;

import java.util.Scanner;

public class mainn {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // User
        user user = new user();
        user.registerUser(scanner);

        // Books
        book book1 = new book();
        book1.title = "Java Básico";
        book1.author = "Autor 1";
        book1.available = true;

        book book2 = new book();
        book2.title = "Programación I";
        book2.author = "Autor 2";
        book2.available = true;

        book book3 = new book();
        book3.title = "Sistemas Operativos";
        book3.author = "Autor 3";
        book3.available = true;

        // Loans (máximo 2)
        loans loan1 = null;
        loans loan2 = null;

        int option;

        do {
            System.out.println("\n=== MENÚ BIBLIOTECA ===");
            System.out.println("1. Ver información de los libros");
            System.out.println("2. Pedir prestado un libro");
            System.out.println("3. Devolver un libro");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            option = scanner.nextInt();
            scanner.nextLine(); // limpiar salto de línea

            switch (option) {

                case 1:
                    System.out.println("\nLibro 1");
                    System.out.println(book1);
                    System.out.println("----------------");

                    System.out.println("Libro 2");
                    System.out.println(book2);
                    System.out.println("----------------");

                    System.out.println("Libro 3");
                    System.out.println(book3);
                    System.out.println("----------------");
                    break;

                case 2:
                    if (!user.canBorrow()) {
                        System.out.println("No puedes pedir más de 2 libros.");
                        break;
                    }
                    System.out.println("\nLibro 1");
                    System.out.println(book1.title);
                    System.out.println("----------------");

                    System.out.println("Libro 2");
                    System.out.println(book2.title);
                    System.out.println("----------------");

                    System.out.println("Libro 3");
                    System.out.println(book3.title);
                    System.out.println("----------------");

                    System.out.print("Elige el libro (1-3): ");
                    int borrowOption = scanner.nextInt();
                    scanner.nextLine();

                    book borrowedBook = null;

                    if (borrowOption == 1) borrowedBook = book1;
                    else if (borrowOption == 2) borrowedBook = book2;
                    else if (borrowOption == 3) borrowedBook = book3;
                    else {
                        System.out.println("Opción inválida.");
                        break;
                    }

                    if (!borrowedBook.canBeBorrowed()) {
                        System.out.println("El libro no está disponible.");
                        break;
                    }

                    borrowedBook.borrow();
                    user.addLoan();

                    if (loan1 == null || !loan1.active) {
                        loan1 = new loans(borrowedBook);
                    } else {
                        loan2 = new loans(borrowedBook);
                    }

                    System.out.println("Libro prestado correctamente.");
                    break;

                case 3:
                    if (!user.hasLoans()) {
                        System.out.println("No tienes libros para devolver.");
                        break;
                    }

                    System.out.print("Elige el libro a devolver (1-3): ");
                    int returnOption = scanner.nextInt();
                    scanner.nextLine();

                    book returnedBook = null;

                    if (returnOption == 1) returnedBook = book1;
                    else if (returnOption == 2) returnedBook = book2;
                    else if (returnOption == 3) returnedBook = book3;
                    else {
                        System.out.println("Opción inválida.");
                        break;
                    }

                    if (returnedBook.available) {
                        System.out.println("Ese libro ya está disponible.");
                        break;
                    }

                    returnedBook.returnBook();
                    user.removeLoan();

                    if (loan1 != null && loan1.book == returnedBook && loan1.active) {
                        loan1.closeLoan();
                    } else if (loan2 != null && loan2.book == returnedBook && loan2.active) {
                        loan2.closeLoan();
                    }

                    System.out.println("Libro devuelto correctamente.");
                    break;

                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (option != 4);

        scanner.close();
    }
}
