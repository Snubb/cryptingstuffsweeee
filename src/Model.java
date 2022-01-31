import java.io.*;
import java.util.ArrayList;

public class Model {
    public Model(){

    }

    public String encryptMessage(String message, char key) {
        String encryptedMessage = "";
        ArrayList<Integer> messageArray = new ArrayList<>();
        for (int i = 0; i < message.length(); i++) {
            messageArray.add((int)message.charAt(i));
        }

        for (int i = 0; i < messageArray.size(); i++) {
            encryptedMessage += (char)(messageArray.get(i)^key);
        }

        return encryptedMessage;
    }

    public void writeFile(String filenameTxt, String text) {
        try {
            PrintWriter txtOut = new PrintWriter(new BufferedOutputStream(new FileOutputStream(filenameTxt)));
            txtOut.println(text);
            txtOut.flush();
            txtOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String printFile(String filenameTxt) {
        String newString = "";
        try {
            BufferedReader txtIn = new BufferedReader(new FileReader("test.txt"));
            System.out.println("Text data: ");
            while ((txtIn.readLine()) != null) {
                System.out.println(txtIn.readLine());
                newString += txtIn.readLine() + "\n";
            }

            txtIn.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return newString;
    }
}
