package proyectofullstack;

import java.util.ArrayList;
import java.util.List;

public class Library {
    // Atributos
    List<book> bookList;
    List<user> userList;
    List<loans> loanList;

    // Constructor
    public Library() {
        bookList = new ArrayList<>();
        userList = new ArrayList<>();
        loanList = new ArrayList<>();
    }

    // Métodos
    public List<book> getBooks() {
        return bookList;
    }

    public List<user> getUsers() {
        return userList;
    }

    public List<loans> getLoans() {
        return loanList;
    }
}
