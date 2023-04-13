package animalFavorite;

public class Dog {
   private   String name;
   private   String sound;

    public Dog() {
    }
    public Dog(String name , String sound){
        this.name = name;
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeNoise(){
       System.out.println(name + " " +  sound);
   }
}
