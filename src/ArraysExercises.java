import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson(Person[] personArray, Person newPerson) {
        Person[] newPersonArray = Arrays.copyOf(personArray, personArray.length + 1);
        newPersonArray[newPersonArray.length - 1] = newPerson;
        return newPersonArray;
    }

    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
//        System.out.println(Arrays.toString(numbers));// to string is needed to have string representation of the array;
//
        Person mike = new Person("Mike", 40);
        Person henry = new Person("Henry", 21);
        Person mary = new Person("Mary", 30);
        Person[] persons = {mike, henry, mary};

        // iterate and print the name of each person
//   for(Person person : persons ){
//       System.out.println(person.getName());
//   }
        // Adding a new name using addPerson method
        Person brook = new Person("Brook", 13);
        Person[] newPersonArray = addPerson(persons, brook);
        for (Person person : newPersonArray) {
            System.out.println(person.getName());
        }
    }
}