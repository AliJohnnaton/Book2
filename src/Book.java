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

    public String getAuthorFullName() {
        return author.getFullName();
    }

    public void printBook() {
        System.out.println('\n' + getAuthorFullName() + '\n' + getName() + '\n'
                + getManufactureYear() + " года выпуска");
    }
}
