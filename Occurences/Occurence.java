// Class used to find the element with more occurences on a list

import java.util.ArrayList;
import java.util.Collections;

public class Occurence {
    public static String occurences() { 
        int highestOc = 0; // Initial attribute used to saved the highest element of occurences on a list
        String name = ""; // Initial attribute used to saved the name with the highest element of occurences on a list
        ArrayList<String> list = new ArrayList<String>(); //Initial List
        list.add("Paul");
        list.add("Carlos");
        list.add("Carlos");
        list.add("Paul");
        list.add("Miguel");
        list.add("Paul");

        // Loop through every element of the list
        for (String i: list) { 
            int occurences = Collections.frequency(list, i); // Method used to obtain the number of occurences
            // Condition to verify if the current number of occurences of the current element of the list is higher than the current value of highestOc
            if (occurences > highestOc){ 
                highestOc = occurences;
                name = i; // Update the name with the current highest occurences
            }
        }
        return name;
    }
    public static void main(String[] args) {
        System.out.println(occurences());
    }
}