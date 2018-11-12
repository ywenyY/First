package example.ploymorphism;

public class Chunwan {
    public static void main(String[] args) {
        Director 张艺谋 = new Director();
        Dancer 赵聪 = new Dancer();
        Singer 宋祖英 = new Singer();
        张艺谋.action(宋祖英);
        张艺谋.action(赵聪);
    }
}

