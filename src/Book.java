import java.util.Objects;

public class Book {
    private final Author author;
    private final String name;
    private int manufactureYear;

    public Book(Author author, String name, int year) {
        this.author = author;
        this.name = name;
        this.manufactureYear = year;
    }

    public Book(String authorName, String authorSurname, String name, int year) {
        this.author = new Author(authorName, authorSurname);
        this.name = name;
        this.manufactureYear = year;
    }

    public String getName() {
        return name;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public Author getAuthor() {
        return author;
    }

    public String getAuthorFullName() {
        return author.getFullName();
    }

    public void printBook() {
        System.out.println('\n' + getAuthorFullName() + '\n' + getName() + '\n'
                + getManufactureYear() + " года выпуска");
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return manufactureYear == book.manufactureYear && Objects.equals(author, book.author) && Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, name, manufactureYear);
    }

    @Override
    public String toString() {
        return "Автор: " + author +
                ", название='" + name + '\'' +
                ", год выпуска=" + manufactureYear;
    }
}
