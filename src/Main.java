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
        Author secondAuthor = secondBook.getAuthor();
        Author secSecondAuthor = new Author("Оскар", "Уайльд");
        System.out.println();
        System.out.println(firstAuthor.equals(secondAuthor) + " " + firstAuthor.hashCode() +
                " \n" + firstAuthor);
        System.out.println();
        System.out.println(firstBook.equals(secondBook) + " " + firstBook.hashCode() + " \n" + firstBook);
        System.out.println();
        System.out.println(secondAuthor.equals(secSecondAuthor) + " " + secondAuthor.hashCode() +
                " \n" + secondAuthor);
        Book secSecondBook = new Book("Оскар", "Уайльд", "Портрет Дориана Грея", 1890);
        System.out.println();
        System.out.println(secondBook.equals(secSecondBook) + " " + secondBook.hashCode() +
                " \n" + secondBook);
    }
}