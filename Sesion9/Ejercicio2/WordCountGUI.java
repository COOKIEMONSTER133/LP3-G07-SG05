package ejerciicio2;

import java.awt.Label;
import java.io.IOException;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WordCountGUI extends JFrame {

    private WordCount wordCount;

    public WordCountGUI(String filename) throws IOException {
        super("WordCount");

        wordCount = new WordCount(filename);
        wordCount.countLinesWordsAndCharacters();

        initComponents(filename);
    }

    private void initComponents(String f) {
        Label labelFilename = new Label("File: ");
        Label labelLines = new Label("Lines = ");
        Label labelWords = new Label("Words = ");
        Label labelCharacters = new Label("Chars = ");

        labelFilename.setText("File: " + f);
        labelLines.setText("Lines = " + wordCount.lines);
        labelWords.setText("Words = " + wordCount.words);
        labelCharacters.setText("Chars = " + wordCount.characters);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel.add(labelFilename);
        panel.add(labelLines);
        panel.add(labelWords);
        panel.add(labelCharacters);

        add(panel);

        setSize(300, 150);

        setLocationRelativeTo(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }
}