package com.fabrisayko.generatoresorteggi.generatore;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GeneratoreController {
    public static String generaSorteggi(String nominativi) {
        String[] namesArray = nominativi.split("\\r?\\n");

        // Convert the array to a list for easier shuffling
        List<String> namesList = Arrays.asList(namesArray);

        // Shuffle the list to randomize the order of names
        Collections.shuffle(namesList);

        // Join the shuffled names back into a single string with newline separator
        String shuffledNames = String.join("\n", namesList);

        return shuffledNames;

    }
}
