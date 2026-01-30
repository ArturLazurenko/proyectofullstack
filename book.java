package proyectofullstack;

public class book {
    String title;
    String author;
    boolean available;

    public void showBook() {
        System.out.println("------------------------");
        System.out.println("Titulo: " + title);
        System.out.println("Autor: " + author);
        System.out.println("Disponible: " + (available ? "Si" : "No"));
        System.out.println("------------------------");
    }

    public boolean canBeBorrowed() {
        return available;
    }

    public void borrow() {
        available = false;
        }

    public void returnBook() {
        available = true;
    }
    
     @Override
    public String toString() {
        return "Título: " + title +
               "\nAutor: " + author +
               "\nDisponible: " + available;
}
}
