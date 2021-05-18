package Structural.Composite.Boec;

public class CompositeDemo {
    public static void main(String[] args) {
        Book Index = new Book("Index","Author1","Index",1);
        Book ScifiBook1 = new Book("sci-fi1","Author2","sci-fi",2);
        Book ScifiBook2 = new Book("sci-fi2","Author2","sci-fi",3);
        Book Comedy = new Book("comedy","Author3","comedy",4);
        Book Truyencuoi = new Book("Truyen cuoi","Author5","comedy",5);
        Index.add(ScifiBook1);
        Index.add(ScifiBook2);
        Index.add(Comedy);
        Comedy.add(Truyencuoi);
        System.out.println(Index);
        for(Book subBook : Index.getListBook()){
            System.out.println(subBook);
            for(Book book : subBook.getListBook()){
                System.out.println(book);
            }
        }

    }
}
