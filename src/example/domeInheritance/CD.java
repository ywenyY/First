package example.domeInheritance;

public class CD extends Item {
    private int numberOfTracks = 0;

    public CD(String title, int not) {
        super(title);
        super.print();
        numberOfTracks = not;
        System.out.println("the number of the tracks are : " + not);
    }

    public static void main(String[] args) {
        CD cd = new CD("secrets", 8);
        //cd.print();
    }
}

