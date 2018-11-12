package example.ploymorphism;

public class Dancer extends Actor {
    public Dancer() {
        super();
    }

    public Dancer(String name) {
        super(name);
    }

    public void performs() {
        System.out.println("舞蹈演员" + getName() + "正在北命");
    }
}


