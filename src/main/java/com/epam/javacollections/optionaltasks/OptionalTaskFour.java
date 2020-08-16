package com.epam.javacollections.optionaltasks;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OptionalTaskFour {
    private static final String theRoadNotTaken =
            "Two roads diverged in a yellow wood, \n"+
                    "And sorry I could not travel both \n"+
                    "And be one traveler, long I stood \n"+
                    "And looked down one as far as I could \n"+
                    "To where it bent in the undergrowth; \n"+
                    "Then took the other, as just as fair, \n"+
                    "And having perhaps the better claim, \n"+
                    "Because it was grassy and wanted wear; \n"+
                    "Though as for that the passing there \n"+
                    "Had worn them really about the same, \n"+
                    "And both that morning equally lay \n"+
                    "In leaves no step had trodden black. \n"+
                    "Oh, I kept the first for another day! \n"+
                    "Yet knowing how way leads on to way, \n"+
                    "I doubted if I should ever come back. \n"+
                    "I shall be telling this with a sigh \n"+
                    "Somewhere ages and ages hence: \n"+
                    "Two roads diverged in a wood, and I— \n"+
                    "I took the one less traveled by, \n"+
                    "And that has made all the difference. \n";
    private static final Comparator<String> lineCounter = Comparator.comparingInt(String::length);

    public static void sortSonnetByLineLength() {
        List<String> lines = Arrays.asList(theRoadNotTaken.split("\n"));
        lines.sort(lineCounter);
        System.out.println("Sonnet sorted by the length of lines:\n" + lines);
    }
}

