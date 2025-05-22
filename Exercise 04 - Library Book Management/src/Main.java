import java.util.ArrayList;
import java.util.Scanner;

class Book{
    private String title;
    private String authorName;
    private int ISBN;

    public Book(String _title, String _authName, int isbn){
        if(_title.isEmpty()){ throw new IllegalArgumentException("Title cant be empty"); }
        if(_authName.isEmpty()){ throw new IllegalArgumentException("Author name cant be empty"); }

        this.title = _title;
        this.authorName = _authName;
        this.ISBN = isbn;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + authorName + ", ISBN: " + ISBN;
    }
}

class BookManager{
    ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
        System.out.println("donation successful!");
    }

    public void allBooks(){
        for(Book book: books){
            System.out.println("hey"+book);
        }
    }
}

class Main{

    public static void main(String... args){
        try(Scanner sc = new Scanner(System.in)){
            BookManager manager = new BookManager();

            while(true){
                System.out.println("1. Donate a Book");
                System.out.println("2. View all Books");
                System.out.println("3. search a Book");
                System.out.println("4. Rent a Book ");
                System.out.println("5. return a Book");
                System.out.print("Enter: ");

                if(sc.hasNextInt()){

                    int choice = sc.nextInt();
                    sc.nextLine();

                    switch(choice){
                        case 1:
                            System.out.println("-----Donate a Book-----");
                            System.out.print("Enter Book Title: ");
                            String title = sc.nextLine().trim();

                            System.out.print("Author Name: ");
                            String authorName = sc.nextLine().trim();

                            System.out.print("ISBN number: ");
                            int isbn = sc.nextInt();
                            sc.nextLine();

                            Book personOne = new Book(title, authorName, isbn);
                            manager.addBook(personOne);
                            break;

                        case 2:
                            manager.allBooks();
                            break;

                        default:
                            System.out.println("invalid input");
                    }
                }else{
                    System.out.println("invalid Input");
                    sc.next();
                }
            }
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}