import java.util.ArrayList;

public class Kryptering {
    public static void main(String[] args) {
        String message = "HAJ PÅ DAJ";
        char key = '(';
        String cryptedMessage = "";

        cryptedMessage = encryptMessage(message, key);
        System.out.println(cryptedMessage);
        System.out.println(encryptMessage(message, key));
        System.out.println(encryptMessage(cryptedMessage, key));
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

