import java.util.ArrayList;

public class Kryptering {
    public static void main(String[] args) {
        String message = "HAJ PÅ DAJ";
        char key = '(';
        String cryptedMessage = "";

        cryptedMessage = encryptMessage(toIntArray(message), key);
        System.out.println(cryptedMessage);
        System.out.println(encryptMessage(toIntArray(cryptedMessage), key));
    }
    public static String encryptMessage(ArrayList<Integer> message, char key) {
        String encryptedMessage = "";

        for (int i = 0; i < message.size(); i++) {
            encryptedMessage += (char)(message.get(i)^key);
        }

        return encryptedMessage;
    }

    public static ArrayList<Integer> toIntArray(String message) {
        ArrayList<Integer> newArray = new ArrayList<>();
        for (int i = 0; i < message.length(); i++) {
            newArray.add((int)message.charAt(i));
        }
        return newArray;
    }

}

