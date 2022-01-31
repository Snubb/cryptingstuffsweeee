import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    private Model model;
    private View view;
    public Controller(){
        model = new Model();
        view = new View();

        JFrame frame = new JFrame("notepadView");
        frame.setContentPane(view.getPanel1());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        view.getEncryptButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String key = JOptionPane.showInputDialog("Provide key");
                view.setEncryptedText(model.encryptMessage(view.getTextArea().getText(), key.toCharArray()[0]));
            }
        });

        view.getSaveButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String filename = JOptionPane.showInputDialog("Filename: ") + ".txt";
                model.writeFile(filename, view.getEncryptedTextArea().getText());
            }
        });

        view.getOpenButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String filename = JOptionPane.showInputDialog("Filename: ");
                view.setText(model.printFile(filename));
            }
        });
    }







    public static void main(String[] args) {
        Controller controller = new Controller();
    }
}
