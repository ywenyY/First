package example.domeInheritance;

import java.util.ArrayList;
public class Database {
    private ArrayList<Item> items = new ArrayList<Item>();

    public void add(Item i) {
        items.add(i);
    }

    public void list() {
        for (Item i : items) {
            i.print();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Database db = new Database();
        db.add(new CD("music", 8));
        db.add(new DVD("sing", "me"));
        db.list();
    }

}