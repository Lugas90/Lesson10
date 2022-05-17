import java.util.Objects;

public class Book {
    private String title;
    private BookAuthor author;
    private int yearPublisher;

    public Book(String title, BookAuthor author, int yearPublisher) {
        this.title = title;
        this.yearPublisher = yearPublisher;
        this.author = author;
    }

    public String getTitle() {
        return this.title;
    }

    public int getYearPublisher() {
        return this.yearPublisher;
    }

    public BookAuthor getAuthor() {
        return this.author;
    }

    public void setYearPublisher(int yearPublisher) {
        this.yearPublisher = yearPublisher;
    }
    public String toString (){
        return "Книга: " + title + ", " + "Автор: " + author.getNameAuthor() + " " + author.getSurnameAuthor() + ", " +  "год публикации: " + yearPublisher;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        return this.title.equals(((Book) other).title) && this.author.equals(((Book) other).author) && this.yearPublisher == ((Book) other).yearPublisher;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, yearPublisher);
    }
}
