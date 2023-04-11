public class Bob {
    public static void main(String[] args) {
        String input = "Can you please take the trash out?";
        if(input.endsWith("?")) {
            System.out.println("Sure");
        }else if(input.endsWith("!")){
            System.out.println("Whoa, chill out!");
        }else if(input.equals(" ")){
            System.out.println("Fine");
        }else{
            System.out.println("Whatever");
        }
    }
}
