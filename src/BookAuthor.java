import java.util.Objects;

public class BookAuthor {
    private String nameAuthor;
    private String surnameAuthor;

    public BookAuthor (String nameAuthor, String surnameAuthor){
        this.nameAuthor = nameAuthor;
        this.surnameAuthor = surnameAuthor;
    }
    public String getNameAuthor (){
        return this.nameAuthor;
    }
    public String getSurnameAuthor() {
        return surnameAuthor;
    }
    public  String toString (){
        return "Автор: " + this.nameAuthor + " " + this.surnameAuthor;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()){
            return false;
        }
        return this.nameAuthor.equals(((BookAuthor) other).nameAuthor) && this.surnameAuthor.equals(((BookAuthor) other).surnameAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAuthor, surnameAuthor);
    }
}
