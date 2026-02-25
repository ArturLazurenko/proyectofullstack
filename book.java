package proyectofullstack;

public class book {
    private int id;
    private String title;
    private String author;
    private String genre;
    private boolean available;

    public book(int id, String title, String author, String genre) {
        this.id        = id;
        this.title     = title;
        this.author    = author;
        this.genre     = genre;
        this.available = true;
    }

    public void showInfo() {
        System.out.println("------------------------");
        System.out.println("ID     : " + id);
        System.out.println("Titulo : " + title);
        System.out.println("Autor  : " + author);
        System.out.println("Genero : " + genre);
        System.out.println("Estado : " + (available ? "Disponible" : "Prestado"));
        System.out.println("------------------------");
    }

    public boolean canBeBorrowed() {
        return available;
    }

    public void borrow() {
        this.available = false;
    }

    public void returnBook() {
        this.available = true;
    }

    @Override
    public String toString() {
        return "[" + id + "] " + title + " - " + author
                + " (" + (available ? "Disponible" : "Prestado") + ")";
    }

    public int     getId()       { return id; }
    public String  getTitle()    { return title; }
    public String  getAuthor()   { return author; }
    public String  getGenre()    { return genre; }
    public boolean isAvailable() { return available; }
}