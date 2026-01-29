package proyectofullstack;

import java.util.Scanner;

public class mainn {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Library library = new Library();

        book book = new book();
        user user = new user();
        loans loan = new loans();

        book.registerBook(sc);
        user.registerUser(sc);

        library.getBooks().add(book);
        library.getUsers().add(user);

        // Crear préstamo
        if (book.available) {
            loan.registerLoan(1);
            book.markBorrowed();
            user.addLoan();
            library.getLoans().add(loan);
        }

        // Mostrar datos
        book.showBook();
        user.getUser();

        sc.close();
    }
}
