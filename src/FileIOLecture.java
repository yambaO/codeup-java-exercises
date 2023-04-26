import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIOLecture {
    public static void main(String[] args) {
        String directory = "data";
        String filename = "groceries.txt";

        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);

        if (Files.notExists(dataDirectory)) {
            try {
                Files.createDirectories(dataDirectory);
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
        if (! Files.exists(dataFile)) {
            try {
                Files.createFile(dataFile);
            } catch(IOException e) {
                e.printStackTrace();
            }
        }

        // the directory and the file definitely exist now
        List<String> groceryList = Arrays.asList("Coffee", "Milk", "Double Stuf Oreos");
        // System.out.println(groceryList);
        try {
            Files.write(dataFile, groceryList);
            List<String> moreGroceries = Arrays.asList("Peanut Oil", "Flour", "Eggs");
            Files.write(
                    dataFile,
                    moreGroceries,
                    StandardOpenOption.APPEND
            );
        } catch(IOException e) {
            e.printStackTrace();
        }

        // We have our LIST! Now let's double-check it has the most important ingredient!
        Boolean hasPowderedSugar = false;
        try {
            List<String> lines = Files.readAllLines(dataFile);
            for (String line : lines) {
                if (line.equals("Powdered Sugar")) {
                    hasPowderedSugar = true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // We DEFINITELY know if "Powdered Sugar" is in the list or not
        if (!hasPowderedSugar) {
            List<String> addPowderedSugar = Arrays.asList("Powdered Sugar");
            try {
                Files.write(
                        dataFile,
                        addPowderedSugar,
                        StandardOpenOption.APPEND
                );
            } catch(IOException e) {
                e.printStackTrace();
            }
        }

        // Uh oh, we have some of "those" people who don't like Double Stuf
        try {
            List<String> lines = Files.readAllLines(dataFile);
            List<String> newList = new ArrayList<>();
            for (String line : lines) {
                if (line.equals("Double Stuf Oreos")) {
                    newList.add("Regular Oreos"); // yuck
                } else {
                    newList.add(line);
                }
            }
            Files.write(dataFile, newList);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Now let's sout out the list with all the changes from the file
        try {
            List<String> groceryListFromFile = Files.readAllLines(dataFile);
            // System.out.println(groceryListFromFile);
            for (int i = 1; i <= groceryListFromFile.size(); i += 1) {
                System.out.println(i + ": " + groceryListFromFile.get(i-1));
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
