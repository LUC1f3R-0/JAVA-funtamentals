public class Book {
    String title;
    int pages;

    Book(String _title, int _pages){
        this.title = _title;
        this.pages = _pages;
    }

    String display(){
        return this.title+" has ("+ this.pages+") pages";
    }
//
//    @Override
//    public String toString(){
//        return this.title+" has ("+ this.pages+" pages)";
//    }
//
//    public void showList(){
//
//        for (){
//
//        }
//
//    }
}
