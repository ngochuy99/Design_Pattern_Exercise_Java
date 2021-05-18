package Structural.Proxy.Boec;

import java.util.ArrayList;
import java.util.List;

public class demo {
    public static void main(String[] args) {
        List<Book> bookLists = new ArrayList<>();
        List<Clothes> clothesList = new ArrayList<>();
        List<Electronic> electronicList = new ArrayList<>();
        for(int i=0;i<=5;i++){
            Book book = new Book(i,"book "+i);
            Clothes clothes = new Clothes(i,"clothes "+i);
            Electronic electronics = new Electronic(i,"Electronics "+i);
            bookLists.add(book);
            clothesList.add(clothes);
            electronicList.add(electronics);
        }
        ProxyItem proxyItem = new ProxyItem(bookLists,clothesList,electronicList);
        proxyItem.getItem();
    }
}
