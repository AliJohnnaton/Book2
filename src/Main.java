public class Main {
    public static void main(String[] args) {
        Author firstAuthor = new Author("Лев", "Толстой");
        Book firstBook = new Book(firstAuthor, "Война и мир", 1867);
        Book secondBook = new Book("Оскар", "Уайльд", "Портрет Дориана Грея", 1889);
        System.out.println('\n' + firstBook.getAuthorFullName() + '\n' + firstBook.getName() + '\n'
                + firstBook.getManufactureYear() + " года выпуска");
        secondBook.printBook();
        secondBook.setManufactureYear(1890);
        secondBook.printBook();
    }
}