

public class Main {
    public static void main(String[] args) {
        Book bookOne = new Book("The Fellow of the Ring", 435);
        Book bookTwo = new Book("The Two Towers", 352);
        Book bookThree = new Book("The Return of the King", 416);

        Book[] books = {bookOne, bookTwo, bookThree};

//        System.out.println(bookOne.display());

//        for(Book book: books){
//            System.out.println(book.display());
//        }

        Library library = new Library("NYC", 1980, books);
    }
}