package example.ploymorphism;


public class Actor {
    private String name;

    public Actor() {

    }

    public Actor(String name) {
        setName(name);
    }

    public void performs() {
        System.out.println("演员" + "正在表演精彩的节目");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}



