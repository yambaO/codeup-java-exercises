package vehicles;

public class Vehicle {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeNoise(){
        System.out.println("Vroom Vroom");
    }

    @Override
    public String toString(){
        return this.getName();
    }
}
