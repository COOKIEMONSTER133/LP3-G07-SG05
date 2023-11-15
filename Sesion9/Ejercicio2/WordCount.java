package ejerciicio2;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class WordCount {

    protected String filename;
    int lines;
    protected int words;
    protected int characters;

    public WordCount(String filename) {
        this.filename = filename;

    }

    public void countLinesWordsAndCharacters() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                this.lines++;
                this.characters += line.length();
                this.words += countWords(line);
            }
        }
    }

    private int countWords(String line) {
        int wordCount = 0;
        Scanner sc = new Scanner(line);
        while (sc.hasNext()) {
            sc.next();
            wordCount++;
        }

        sc.close();
        return wordCount;
    }

}
