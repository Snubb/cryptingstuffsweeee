import javax.swing.*;

public class View {
    private JTextArea textArea;
    private JPanel panel1;
    private JButton saveButton;
    private JButton encryptButton;
    private JTextArea encryptedTextArea;
    private JButton openButton;

    public JTextArea getTextArea() {
        return textArea;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public JButton getSaveButton() {
        return saveButton;
    }

    public JButton getEncryptButton() {
        return encryptButton;
    }

    public JTextArea getEncryptedTextArea() {
        return encryptedTextArea;
    }

    public void setText(String text) {
        textArea.setText(text);
    }
    public void setEncryptedText(String text){
        encryptedTextArea.setText(text);
    }

    public  View(){

    }

    public JButton getOpenButton() {
        return openButton;
    }
}
