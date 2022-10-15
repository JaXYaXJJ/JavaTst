package HWClassesAndLoops;

public class Main {
    public static void main(String[] args) {

        Word userWord = new Word(
                "שלום",
                "peace",
                "мир"
        );

        Book userBook = new Book(
                "Nineteen Eighty-Four",
                "George Orwell",
                328
        );

        System.out.println(userWord);

        System.out.println(userBook);
        System.out.println(userBook.getName());
        System.out.println(userBook.getAuthor());
        System.out.println(userBook.getNumberOfPages());
    }
}
