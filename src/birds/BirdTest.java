package birds;

public class BirdTest {

    public static void main(String[] args) {
        Quaker quaker = new Quaker();
        quaker.setName("Quaker");
        quaker.makeNoise();
        Finch finch = new Finch();
        finch.setName("Finch");
        finch.makeNoise();
        Goose goose = new Goose();
        goose.setName("Goose");
        goose.makeNoise();
        Bird goose2 = new Goose();
        goose2.setName("Second goose");
        goose2.makeNoise();
    }
}
