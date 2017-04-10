import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by zhengkevin on 4/9/17.
 */
public class FileCounter {

    ArrayList<char[]> al = new ArrayList<>();

    public FileCounter() {

    }

    /**
     * Processes an input source and adds its character, word, and line
     * counts to this counter.
     *
     * @param in the scanner to process
     */
    public void read(Scanner in) {

        while (in.hasNextLine()) {
            char[] nextline = in.nextLine().toCharArray();
            al.add(nextline);
        }
    }

    /**
     * Gets the number of words in this counter.
     *
     * @return the number of words
     */
    public int getWordCount() {

        int count = 0;

        for (int i = 0; i < al.size(); i++) {
            for (char character:al.get(i)){
                if (character == ' '){
                    count++;
                }
            }
            count++;
        }

        return count;
    }

    /**
     Gets the number of lines in this counter.
     @return the number of lines
    */
     public int getLineCount()
     {

         return al.size();
     }

     /**
     Gets the number of characters in this counter.
     @return the number of characters
      */
     public int getCharacterCount()
     {

         int count = 0;

         for (int i = 0; i < al.size(); i++) {
             for (char character:al.get(i)){
                 if (character == ' '){
                     continue;
                 }
                 count++;
             }
         }

         return count;
     }

}

