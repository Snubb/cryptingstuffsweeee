import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class Model {
    public Model(){

    }

    public String encryptMessage(String message, long key) {
        String encryptedMessage = "";
        ArrayList<Integer> messageArray = new ArrayList<>();
        for (int i = 0; i < message.length(); i++) {
            messageArray.add((int)message.charAt(i));
        }

        Random randkey = new Random(key);
        for (int i = 0; i < messageArray.size(); i++) {
            encryptedMessage += (char)(messageArray.get(i)^randkey.nextInt());
        }

        return encryptedMessage;
    }

    public void writeFile(String text) {
        try {
            PrintWriter txtOut = new PrintWriter(new BufferedOutputStream(new FileOutputStream(selectFile())));
            txtOut.println(text);
            txtOut.flush();
            txtOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String openFile() {
        String newString = "";

        String filename = "";
        filename = selectFile();
        System.out.println(filename);

        FileReader fr = null;
        try {
            fr = new FileReader(filename);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        assert fr != null;
        BufferedReader inFile = null;
        inFile = new BufferedReader(fr);

        String line;
        try {
            while ((line = inFile.readLine()) != null) {
                newString+=line;
            }
            inFile.close();
        } catch (IOException E) {
            E.printStackTrace();
        }
        return newString;

    }

    private String selectFile() {
        String filePath = "";
        JFileChooser fc = new JFileChooser();
        int result = 0;
        result = fc.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            filePath = fc.getSelectedFile().getAbsolutePath();
        } else {
            System.out.println("CHOOSE FILE BASTARD");
        }
        return filePath;
    }
}
