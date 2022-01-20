import java.util.ArrayList;

public class Kryptering {
    public static void main(String[] args) {
        String message = "HAJ PÅ DAJ DU";
        char key = '(';
        String cryptedMessage = "";
        String binaryMessage = "";

        for (int i = 0; i < message.length(); i++) {
            cryptedMessage += (char)(message.charAt(i)^key);
            //binaryMessage += (char)(message.charAt(i)^key);
        }
        System.out.println(cryptedMessage);
        ArrayList<String> binaryArray = new ArrayList();
        for (int i = 0; i < message.length(); i++) {
            //binaryMessage = "";
            binaryMessage += Integer.toBinaryString((cryptedMessage.charAt(i)^key));
            binaryArray.add(Integer.toBinaryString((cryptedMessage.charAt(i)^key)));
        }
        System.out.println(binaryMessage);

        for (int i = 0; i < binaryArray.size(); i++) {
            System.out.println(Integer.parseInt(binaryArray.get(i)));
        }
        System.out.println("\n");

        for (int i = 0; i < cryptedMessage.length(); i++) {
            System.out.println("" + ((int)cryptedMessage.charAt(i)));
        }
    }
}
