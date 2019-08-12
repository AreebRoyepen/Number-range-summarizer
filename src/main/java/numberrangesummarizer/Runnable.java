package numberrangesummarizer;

import java.util.Scanner;

public class Runnable {

    public static void main (String args []){


        // A command line interface to use the summarizer
        NumberRangeSummarizerImpl summarizer = new NumberRangeSummarizerImpl();

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter comma delimited string of numbers: (eg. 1,2,3,4):");

        String output =summarizer.summarizeCollection(summarizer.collect(scn.next()));


        System.out.println("Output: \n" + output);


    }


}
