package proyectofullstack;

public class loans {
    // Atributos
    private int loanId;
    private book book;
    private boolean active;

    public loans(int loanId, book book) {
        this.loanId = loanId;
        this.book   = book;
        this.active = true;
    }

    public void closeLoan() {
        this.active = false;
    }

    public void showInfo() {
        System.out.println("Prestamo #" + loanId
                + " | Libro: " + book.getTitle()
                + " | Estado: " + (active ? "Activo" : "Cerrado"));
    }

    @Override
    public String toString() {
        return "Prestamo #" + loanId + " [" + book.getTitle() + "] - "
                + (active ? "Activo" : "Cerrado");
    }

    public int getLoanId() { 
        return loanId; 
    }

    public book getBook() { 
        return book; 
    }

    public boolean isActive() { 
        return active; 
    }
}
