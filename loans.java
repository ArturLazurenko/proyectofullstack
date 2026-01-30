package proyectofullstack;

public class loans {
    // Atributos
    book book;
    boolean active;

    public loans(book book) {
        this.book = book;
        this.active = true;
    }

    public void closeLoan() {
        active = false;
    }
}
