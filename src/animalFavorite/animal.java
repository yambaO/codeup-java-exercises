package animalFavorite;

public class animal {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setName("Max");
        dog1.setSound("Wouff") ;
        dog1.makeNoise();
        Dog dog2 = new Dog("Bruce", Quote.randomQuote());
        dog2.makeNoise();

    }
}
