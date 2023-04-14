import java.lang.Math;
import java.lang.reflect.Array;
public class ServerNameGenerator {
   static String[] adjectives = {"sleek", "spicy", "fierce", "luminous", "mysterious", "fragrant", "vibrant", "exquisite", "majestic", "whimsical"};
    static String[] nouns = {"mountain", "ocean", "tree", "sunrise", "rainbow", "butterfly", "book", "guitar", "candle", "star"};

    public static String returnElement(String [] stringArray){
     int index = (int)(Math.random()*9) + 0;
     return stringArray[index];
    }


    public static void main(String[] args) {
        System.out.println("Here is your server name:\n" + returnElement(adjectives)+"-"+returnElement(nouns));


    }
}
