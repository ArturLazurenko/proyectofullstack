package proyectofullstack;

import java.util.Scanner;

public class mainn {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        library library = new library();

        user user = new user();
        user.registerUser(scanner);

        int option;

        do {
            System.out.println("\n=== MENU BIBLIOTECA ===");
            System.out.println("1. Ver informacion de los libros");
            System.out.println("2. Pedir prestado un libro");
            System.out.println("3. Devolver un libro");
            System.out.println("4. Informacion del usuario");
            System.out.println("5. Mostrar los prestamos");
            System.out.println("6. Salir");
            System.out.print("Elige una opcion: ");

            option = leerEntero(scanner);

            switch (option) {

                case 1:
                    library.showAllBooks();
                    break;

                case 2:
                    if (!user.canBorrow()) {
                        System.out.println("No puedes pedir mas de 2 libros.");
                        break;
                    }
                    library.showBookTitles();
                    System.out.print("Elige el libro (1-" + library.getBooksCount() + "): ");
                    int borrowOption = leerEntero(scanner);
                    library.borrowBook(user, borrowOption);
                    break;

                case 3:
                    if (!user.hasLoans()) {
                        System.out.println("No tienes libros para devolver.");
                        break;
                    }
                    library.showBorrowedBooks();
                    library.showBookTitles();
                    System.out.print("Elige el libro a devolver (1-" + library.getBooksCount() + "): ");
                    int returnOption = leerEntero(scanner);
                    library.returnBook(user, returnOption);
                    break;

                case 4:
                    user.showInfo();
                    break;

                case 5:
                    library.showBorrowedBooks();
                    break;
                case 6:
                    System.out.println("Saliendo del programa. adios...");
                    break;

                default:
                    System.out.println("Opcion invalida. Elige entre 1 y 6.");
            }

        } while (option != 6);

        scanner.close();
    }

    private static int leerEntero(Scanner sc) {
        try {
            int value = sc.nextInt();
            sc.nextLine();
            return value;
        } catch (Exception e) {
            sc.nextLine();
            return -1;
        }
    }
}
