package Structural.Proxy.Boec;


import java.util.ArrayList;
import java.util.List;

public class RealItem implements Item {
    private List<Book> bookList = new ArrayList<>();
    private List<Clothes> clothesList = new ArrayList<>();
    private List<Electronic> electronicsList = new ArrayList<>();

    public RealItem(List<Book> bookList, List<Clothes> clothesList, List<Electronic> electronicsList) {
        this.bookList = bookList;
        this.clothesList = clothesList;
        this.electronicsList = electronicsList;
    }

    @Override
    public void getItem() {
        for (Electronic e:electronicsList) {
            System.out.println(e.toString());
        }
        for (Clothes c:clothesList) {
            System.out.println(c.toString());
        }
        for (Book b:bookList) {
            System.out.println(b.toString());
        }
    }
}
