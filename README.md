# V1.1

## Descripción

Primera actualizacion. completa todas las clases y agrega unas lineas de codigo a main

---

## Estructura

Paquete: `proyectofullstack`

Clases:

* `Book`
* `Library` 
* `loans` 
* `user` 
* `mainn`

---

## Clase `User`

**Atributos:**

* `name` (String)
* `activeLoans` (int)

**Métodos:**

* `registerUser(Scanner sc)` → Registra el nombre del usuario
* `getUser()` → Muestra la información del usuario
* `addLoan()` → Incrementa los préstamos activos
* `removeLoan()` → Reduce los préstamos activos

---

## Clase `Loan`

**Atributos:**

* `loanId` (int)
* `active` (boolean)

**Métodos:**

* `registerLoan(int id)` → Registra un nuevo préstamo y lo marca como activo
* `closeLoan()` → Cierra el préstamo

---

## Clase `Library`

**Atributos:**

* `bookList` (List\<Book>)
* `userList` (List\<User>)
* `loanList` (List\<Loan>)

**Métodos:**

* `getBooks()` → Devuelve la lista de libros
* `getUsers()` → Devuelve la lista de usuarios
* `getLoans()` → Devuelve la lista de préstamos


---
# V1.0

## Descripción

Primera version. implementa todas las clases y crea la clase Book

---

## Estructura

Paquete: `proyectofullstack`

Clases:

* `Book`
* `Library` vacia
* `loans` vacia
* `user` vacia
* `Main`

---

## Clase `Book`

**Atributos:**

* `title` (String)
* `author` (String)
* `available` (boolean)

**Métodos:**

* `registerBook()` → Registra título, autor y disponibilidad
* `showBook()` → Muestra la información del libro
* `markBorrowed()` → Marca el libro como prestado
* `markReturned()` → Devuelve el libro (opcional)

---

## Clase `Main`

Contiene el método `main` que ejecuta el programa y prueba las funciones de la clase `Book`.

aun se va a trabajar en esta

---

---
