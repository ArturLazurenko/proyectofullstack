package proyectofullstack;

import java.util.ArrayList;

public class library {
    private ArrayList<book> books;
    private ArrayList<loans> loans;
    private int loanCounter;

    public library() {
        books       = new ArrayList<>();
        loans       = new ArrayList<>();
        loanCounter = 1;
        loadDefaultBooks();
    }

    private void loadDefaultBooks() {
        books.add(new book(1, "Cien anos de soledad", "Gabriel Garcia Marquez", "Realismo magico"));
        books.add(new book(2, "1984",                 "George Orwell",           "Distopia"));
        books.add(new book(3, "Fahrenheit 451",       "Ray Bradbury",            "Ciencia ficcion"));
    }

    public void showAllBooks() {
        System.out.println("\n===== LIBROS EN LA BIBLIOTECA =====");
        for (book b : books) {
            b.showInfo();
        }
    }

    public void showBookTitles() {
        System.out.println("\n===== SELECCIONA UN LIBRO =====");
        for (int i = 0; i < books.size(); i++) {
            String estado = books.get(i).isAvailable() ? "" : " [NO DISPONIBLE]";
            System.out.println((i + 1) + ". " + books.get(i).getTitle() + estado);
        }
    }

    public void showBorrowedBooks() {
        System.out.println("\n===== TUS LIBROS PRESTADOS =====");
        boolean found = false;
        for (loans l : loans) {
            if (l.isActive()) {
                System.out.println("  - " + l.getBook().getTitle());
                found = true;
            }
        }
        if (!found) {
            System.out.println("  No tienes libros prestados.");
        }
    }

    public boolean borrowBook(user user, int bookNumber) {
        if (!user.canBorrow()) {
            System.out.println("No puedes pedir mas de 2 libros.");
            return false;
        }
        if (bookNumber < 1 || bookNumber > books.size()) {
            System.out.println("Opcion invalida.");
            return false;
        }
        book selected = books.get(bookNumber - 1);
        if (!selected.canBeBorrowed()) {
            System.out.println("El libro '" + selected.getTitle() + "' no esta disponible.");
            return false;
        }
        selected.borrow();
        user.addLoan();
        loans.add(new loans(loanCounter++, selected));
        System.out.println("Libro '" + selected.getTitle() + "' prestado correctamente.");
        return true;
    }

    public boolean returnBook(user user, int bookNumber) {
        if (!user.hasLoans()) {
            System.out.println("No tienes libros para devolver.");
            return false;
        }
        if (bookNumber < 1 || bookNumber > books.size()) {
            System.out.println("Opcion invalida.");
            return false;
        }
        book selected = books.get(bookNumber - 1);
        if (selected.isAvailable()) {
            System.out.println("Ese libro ya esta disponible.");
            return false;
        }
        boolean loanFound = false;
        for (loans l : loans) {
            if (l.getBook() == selected && l.isActive()) {
                l.closeLoan();
                loanFound = true;
                break;
            }
        }
        if (!loanFound) {
            System.out.println("No se encontro un prestamo activo para ese libro.");
            return false;
        }
        selected.returnBook();
        user.removeLoan();
        System.out.println("Libro '" + selected.getTitle() + "' devuelto correctamente.");
        return true;
    }

    public ArrayList<book> getBooks() { 
        return books; 
    }
    public ArrayList<loans> getLoans() { 
        return loans; 
    }
    public int getBooksCount() { 
        return books.size(); 
    }
}
