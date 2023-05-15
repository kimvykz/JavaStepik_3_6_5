import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Program {

    public static void main(String[] args) {
        JFrame frame = new JFrame("JSpinner");
        JPanel panel = new JPanel(new GridBagLayout());
        SpinnerNumberModel sModel = new SpinnerNumberModel(0, 0, 20, 1);
        JSpinner spinner = new JSpinner(sModel);
        JButton button = new JButton("Answer");
        JLabel label = new JLabel("How many books will you take? - ");

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridx = 0;
        gbc.gridy = 0;


        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("How many books will you take? - " + spinner.getValue());
            }
        });

        frame.setSize(new Dimension(300, 200));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel.add(spinner, gbc);

        gbc.gridy = 1;
        panel.add(button, gbc);
        gbc.gridy = 2;
        panel.add(label, gbc);
        frame.getContentPane().add(panel);

        frame.setVisible(true);

    }
}
