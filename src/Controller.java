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
                long key = Long.parseLong(JOptionPane.showInputDialog("Provide key:"), 36);
                view.setEncryptedText(model.encryptMessage(view.getTextArea().getText(), key));
            }
        });

        view.getSaveButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.writeFile(view.getEncryptedTextArea().getText());
            }
        });

        view.getOpenButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //String filename = JOptionPane.showInputDialog("Filename: ");
                view.setText(model.openFile());
            }
        });
    }







    public static void main(String[] args) {
        Controller controller = new Controller();
    }
}
