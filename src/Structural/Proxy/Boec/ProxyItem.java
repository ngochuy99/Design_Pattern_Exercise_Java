package Structural.Proxy.Boec;

import Structural.Proxy.Image;
import Structural.Proxy.RealImage;

import java.util.ArrayList;
import java.util.List;

public class ProxyItem implements Item {
    private RealItem realItem;
    private List<Book> bookList = new ArrayList<>();
    private List<Clothes> clothesList = new ArrayList<>();
    private List<Electronic> electronicsList = new ArrayList<>();

    public ProxyItem(List<Book> bookList, List<Clothes> clothesList, List<Electronic> electronicsList) {
        this.bookList = bookList;
        this.clothesList = clothesList;
        this.electronicsList = electronicsList;
    }

    @Override
    public void getItem() {
        if(realItem==null){
            realItem = new RealItem(bookList,clothesList,electronicsList);
        }
        realItem.getItem();
    }
}
