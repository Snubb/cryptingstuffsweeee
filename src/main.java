import java.io.*;

public class main {
    public static void main(String[] args) {
        String filenameTxt = "randDoubles.txt";
        String filenameBin = "randDoubles.bin";

        writeFiles(filenameTxt, filenameBin);
        printFiles(filenameTxt, filenameBin);
    }

    private static void writeFiles(String filenameTxt, String filenameBin) {
        try {
            DataOutputStream binOut = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(filenameBin)));
            PrintWriter txtOut = new PrintWriter(new BufferedOutputStream(new FileOutputStream(filenameTxt)));
            double r;
            int randomAmount = 1000;
            for (int i = 0; i < randomAmount; i++) {
                r = Math.random()*10;
                binOut.writeDouble(r);
                txtOut.println(r);
            }
            binOut.flush();
            txtOut.flush();
            binOut.close();
            txtOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void printFiles(String filenameTxt, String filenameBin) {
        try {
            DataInputStream binIn = new DataInputStream(new BufferedInputStream(new FileInputStream(filenameBin)));
            Double nextDouble;
            System.out.println("Binary data: ");
            boolean isGoing = true;
            while (isGoing) {
                try {
                    nextDouble = binIn.readDouble();
                    System.out.println(nextDouble);
                } catch (IOException e) {
                    isGoing = false;
                }
            }

            BufferedReader txtIn = new BufferedReader(new FileReader(filenameTxt));
            System.out.println("Text data: ");
            isGoing = true;
            while (isGoing) {
                try {
                    nextDouble = Double.parseDouble(txtIn.readLine());
                    System.out.println(nextDouble);
                } catch (NullPointerException e) {
                    isGoing = false;
                }
            }

            binIn.close();
            txtIn.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
