public class Main {
    public static void main(String[] args) {
        BookAuthor bookAuthor1 = new BookAuthor("Лев", "Толстой");
        BookAuthor bookAuthor2 = new BookAuthor("Ричард", "Докинз");
        Book book1 = new Book ("Война и мир", bookAuthor1, 1873 );
        Book book2 = new Book("Бог как иллюзия", bookAuthor2, 2006);

        System.out.println(book1);
        System.out.println(bookAuthor1);
        Book book3 = new Book("Бог как иллюзия", bookAuthor2, 2006);
        System.out.println(book2.equals(book3));
        BookAuthor bookAuthor3 = new BookAuthor("Лев", "Толстой");
        System.out.println(bookAuthor1.equals(bookAuthor3));
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(book3.hashCode());
        System.out.println(bookAuthor1.hashCode());
        System.out.println(bookAuthor3.hashCode());
        System.out.println(bookAuthor2.hashCode());
    }
}