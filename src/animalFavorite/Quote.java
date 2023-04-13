package animalFavorite;

public class Quote {
    public static String randomQuote() {

        int randomNumber = (int) (Math.random() * 4) + 1;
        switch (randomNumber) {
            case 1:
                return "Hello my name is KARL";
            case 2:
                return "I enjoy walking in the backyard";
            case 3:
                return "I am an awesome dog";
            case 4:
                return "my favorite food is beef steak";
            default:
                return "Hello";

        }
    }
}