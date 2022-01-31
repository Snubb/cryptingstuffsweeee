import javax.swing.*;

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
    }







    public static void main(String[] args) {
        Controller controller = new Controller();
    }
}
