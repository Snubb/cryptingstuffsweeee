import java.util.ArrayList;

public class Model {
    public Model(){

    }

    public static String encryptMessage(String message, char key) {
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
}
