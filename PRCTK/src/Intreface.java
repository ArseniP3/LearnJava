

interface printable {
    void print();
}

class Book {
    String name;
    String autor;

    public Book(String name, String autor) {
        this.name = name;
        this.autor = autor;
    }

    public void print () {
        System.out.println(name + " " + autor);
    }
}

class Journal{
    String name;

    public Journal(String name) {
        this.name = name;
    }

    public void print (){
        System.out.println(name);
    }
}
class Programm{
    public static void main(String[] args) {
        Book book1 = new Book("Green book day", "Eliz Braun");
        book1.print();
        Journal journal = new Journal("NesTim");
        journal.print();
    }
}
