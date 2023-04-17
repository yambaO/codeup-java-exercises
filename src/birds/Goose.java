package birds;

public class Goose extends Bird {
    public void makeNoise(){
        System.out.println(this.getName() + " goes honk honk");
    }

    public Goose(){
        System.out.println("New goose created!");
    }
}
