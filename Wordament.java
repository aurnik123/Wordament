	import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Nikhil Auradkar on 5/27/2017.
 * Program that finds and prints 6 letter words in a Wordament game
 */
public class Wordament {
    public static void main(String[] args) throws IOException {
        //DICTIONARY CREATION
        Scanner fileReader = new Scanner(new File("C:\\Users\\aurni\\OneDrive\\Documents\\Wordament\\src\\SixLetterWords"));
        ArrayList<String> dictionary = new ArrayList<>();

        //7
        Scanner fileReader7 = new Scanner(new File("C:\\Users\\aurni\\OneDrive\\Documents\\Wordament\\src\\SevenLetterWords"));
        ArrayList<String> dictionary7 = new ArrayList<>();

        while(fileReader.hasNext()) {
            dictionary.add(fileReader.next());
        }

        //7
        while(fileReader7.hasNext()) {
            dictionary7.add(fileReader7.next());
        }
        //DICTIONARY CREATION


        //BOARD
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 16 character long String of the Wordament board, going across the board.");
        String board = sc.next();
        //BOARD


        //SEQUENCE CREATION
        ArrayList<int[]> sequences = new ArrayList<>();

        for(int a = 0; a <= 15; a++) { //starting places from all sixteen tiles

            //adding on tile 2
            int[] border1 = getBorders(a, board);
            for(int b = 0; b < border1.length; b++) {

                //adding on tile 3
                int[] border2 = getBorders(border1[b], board);
                for(int c = 0; c < border2.length; c++) {

                    //adding on tile 4
                    int[] border3 = getBorders(border2[c], board);
                    for(int d = 0; d < border3.length; d++) {

                        //adding on tile 5
                        int[] border4 = getBorders(border3[d], board);
                        for(int e = 0; e < border4.length; e++) {

                            //adding on tile 6
                            int[] border5 = getBorders(border4[e], board);
                            for(int f = 0; f < border5.length; f++) {
                                int[] possibleSequence = new int[6];

                                possibleSequence[0] = a; //first tile added
                                possibleSequence[1] = border1[b];
                                possibleSequence[2] = border2[c];
                                possibleSequence[3] = border3[d];
                                possibleSequence[4] = border4[e];
                                possibleSequence[5] = border5[f]; //sixth

                                if(!duplicates(possibleSequence)) { //sequence is added if no duplicates
                                    sequences.add(possibleSequence);
                                }
                            }
                        }
                    }
                }
            }
        }

        //7
        ArrayList<int[]> sequences7 = new ArrayList<>();

        for(int a = 0; a <= 15; a++) { //starting places from all sixteen tiles

            //adding on tile 2
            int[] border1 = getBorders(a, board);
            for(int b = 0; b < border1.length; b++) {

                //adding on tile 3
                int[] border2 = getBorders(border1[b], board);
                for(int c = 0; c < border2.length; c++) {

                    //adding on tile 4
                    int[] border3 = getBorders(border2[c], board);
                    for(int d = 0; d < border3.length; d++) {

                        //adding on tile 5
                        int[] border4 = getBorders(border3[d], board);
                        for(int e = 0; e < border4.length; e++) {

                            //adding on tile 6
                            int[] border5 = getBorders(border4[e], board);
                            for(int f = 0; f < border5.length; f++) {

                                //adding on tile 7
                                int[] border6 = getBorders(border5[f], board);
                                for (int g = 0; g < border6.length; g++) {
                                    int[] possibleSequence = new int[7];

                                    possibleSequence[0] = a; //first tile added
                                    possibleSequence[1] = border1[b];
                                    possibleSequence[2] = border2[c];
                                    possibleSequence[3] = border3[d];
                                    possibleSequence[4] = border4[e];
                                    possibleSequence[5] = border5[f]; //sixth
                                    possibleSequence[6] = border6[g]; //seventh

                                    if (!duplicates(possibleSequence)) { //sequence is added if no duplicates
                                        sequences7.add(possibleSequence);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        //SEQUENCE CREATION


        //CONVERSION + FINAL PRINTING
        ArrayList<String> possibles = new ArrayList<>();

        for(int z = 0; z < sequences.size(); z++) {
            String word = num2String(sequences.get(z), board);

            possibles.add(word);
        }

        //7
        ArrayList<String> possibles7 = new ArrayList<>();

        for(int z = 0; z < sequences7.size(); z++) {
            String word = num2String7(sequences7.get(z), board);

            possibles7.add(word);
        }

        findMatches(possibles, dictionary);

        //7
        findMatches(possibles7, dictionary7);
        //CONVERSION + FINAL PRINTING
    }


    /**
     * SEQUENCE CREATION
     * @param i - number of letters in word
     * @return sequences
     */
    public static ArrayList<int[]> sequenceCreation(int i) {
        ArrayList<int[]> sequences = new ArrayList<>();


        return sequences;
    }
    /**
     * helper method for SEQUENCE CREATION
     * @param i - tile number
     * @param board - Wordament board
     * @return
     */
    public static int[] getBorders(int i, String board) {
        if(i == 0 || i == 3 || i == 12 || i == 15) {
            CornerTile temp = new CornerTile(i, board);
            ArrayList<Integer> tempAL = temp.getBorders();

            int[] borders = new int[tempAL.size()];
            for(int z = 0; z < tempAL.size(); z++) {
                borders[z] = tempAL.get(z);
            }

            return borders;
        }

        if(i == 1 || i == 2 || i == 4 || i == 7 || i == 8 || i == 11 || i == 13 || i == 14) {
            EdgeTile temp = new EdgeTile(i, board);
            ArrayList<Integer> tempAL = temp.getBorders();

            int[] borders = new int[tempAL.size()];
            for(int z = 0; z < tempAL.size(); z++) {
                borders[z] = tempAL.get(z);
            }

            return borders;
        }

        if(i == 5 || i == 6 || i == 9 || i == 10) {
            MiddleTile temp = new MiddleTile(i, board);
            ArrayList<Integer> tempAL = temp.getBorders();

            int[] borders = new int[tempAL.size()];
            for(int z = 0; z < tempAL.size(); z++) {
                borders[z] = tempAL.get(z);
            }

            return borders;
        }

        return null;
    }
    /**
     * helper method for SEQUENCE CREATION
     * @param sequence - array
     * @return true if duplicates in array
     */
    public static boolean duplicates(int[] sequence) {
        int size = sequence.length;

        for(int i = 0; i < size; i++) {
            for(int j = i + 1; j < size; j++) {
                if (sequence[i] == sequence[j]) {
                    return true;
                }
            }
        }

        return false;
    }


    /**
     * CONVERSION from number sequence to possible word
     * @param sequence - number sequence
     * @param board - Wordament board
     * @return possible word
     */
    public static String num2String(int[] sequence, String board) {
        String word = "" + board.charAt(sequence[0]) + board.charAt(sequence[1]) +
        board.charAt(sequence[2]) + board.charAt(sequence[3]) + board.charAt(sequence[4]) + board.charAt(sequence[5]);

        return word;
    }
    /**
     * CONVERSION7 from number sequence to possible word
     * @param sequence - number sequence
     * @param board - Wordament board
     * @return possible word
     */
    public static String num2String7(int[] sequence, String board) {
        String word = "" + board.charAt(sequence[0]) + board.charAt(sequence[1]) + board.charAt(sequence[2]) +
                board.charAt(sequence[3]) + board.charAt(sequence[4]) + board.charAt(sequence[5]) + board.charAt(sequence[6]);

        return word;
    }


    /**
     * FINAL PRINTING out valid words
     * @param possibles - ArrayList of possible word strings
     * @param dictionary - dictionary of words
     */
    public static void findMatches(ArrayList<String> possibles, ArrayList<String> dictionary) {

        for(int i = 0; i < possibles.size(); i++) {
            if (isInDictionary(possibles.get(i), dictionary)) {
                System.out.println(possibles.get(i));
            }
        }
    }
    /**
     * binary search to find a word in a dictionary, helper for FINAL PRINTING
     * @param p - the possible word string
     * @param dictionary - dictionary of words
     * @return true if p is in dictionary
     */
    public static boolean isInDictionary(String p, ArrayList<String> dictionary) {
        int low = 0;
        int high = dictionary.size() - 1;

        while(high >= low) {
            int middle = (low + high) / 2;
            String d = dictionary.get(middle);

            if(p.compareTo(d) == 0) {
                return true;
            }
            if(p.compareTo(d) < 0) {
                high = middle - 1;
            }
            if(p.compareTo(d) > 0) {
                low = middle + 1;
            }
        }

        return false;
    }
}
