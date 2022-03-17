package lesson12.examples.example1;

import javax.swing.*;
import java.awt.*;
import java.io.Serial;

public class DialogTime extends JFrame {
    @Serial
    private static final long serialVersionUID = 1L;

    private final JLabel tLabel = new JLabel("    Time");
    private final JTextField tOutput = new JTextField("", 15);
    private final JButton buttonTime = new JButton("GetTime");
    private final JButton buttonExit = new JButton("Exit");
    private final JPanel centerPanel = new JPanel(new GridLayout(2, 2, 5, 5));

    public DialogTime() {
        super("Clock");
        this.setBounds(100, 100, 250, 100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        centerPanel.add(tLabel);
        centerPanel.add(tOutput);
        centerPanel.add(buttonTime);
        centerPanel.add(buttonExit);

        Container container = this.getContentPane();
        container.add(centerPanel, BorderLayout.CENTER);

        buttonTime.addActionListener(e -> {
            long ms = System.currentTimeMillis();
            while (System.currentTimeMillis() - ms < 5000) {
                tOutput.setText(Long.toString(System.currentTimeMillis()));
                System.out.println(tOutput.getText());
            }
            tOutput.setText(Long.toString(System.currentTimeMillis()));
            System.out.println(tOutput.getText());
            System.out.println("buttonTime: THREAD ID = " + Thread.currentThread().getId());
        });
        buttonExit.addActionListener(e -> {
            setVisible(false);
            System.exit(0);
        });
    }
}