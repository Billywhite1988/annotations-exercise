public class Main {

    public static void main(String[] args) {
        Author author = new Author("Sandi", "Metz");

        author.addBook("Practical Object-Oriented Design in Ruby");
        author.addBook("99 Bottles of OOP");

        for (String book: author.publishedBooks()) {
            System.out.println(book);
        }
    }
}





//    method does not override or implement a method from a supertype
//@Override
//Note: src/Main.java uses or overrides a deprecated API.
//        Note: Recompile with -Xlint:deprecation for details.
//        Note: src/Author.java uses unchecked or unsafe operations.
//        Note: Recompile with -Xlint:unchecked for details.
