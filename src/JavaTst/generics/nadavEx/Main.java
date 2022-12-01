package JavaTst.generics.nadavEx;

public class Main {
    public static void main(String[] args) {

    Library<Book> library = new Library();

    MangaBook mangaBook = new MangaBook("","",1999);
    HorrorBook horrorBook = new HorrorBook("","",1990);

    library.addBook(mangaBook);
    library.addBook(horrorBook);

    String name = "Jonathan";
    name = print(name);

    Integer integer = 0;
    integer = print(integer);
    }

    public static <T> T print(T object) {

        System.out.println(object);
        return object;
    }
}
