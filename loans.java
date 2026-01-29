package proyectofullstack;

public class loans {
    // Atributos
    int loanId;
    boolean active;

    // Métodos
    public void registerLoan(int id) {
        loanId = id;
        active = true;

        System.out.println("Prestamo registrado correctamente.");
    }

    public void closeLoan() {
        if (active) {
            active = false;
            System.out.println("Prestamo cerrado correctamente.");
        } else {
            System.out.println("El prestamo ya estaba cerrado.");
        }
    }
}
