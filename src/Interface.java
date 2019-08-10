import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Interface {
    private JFrame frame;
    private JPanel buttonPane, fieldsPanel;
    private JLabel cash;
    private JTextField cashField;
    private JButton cancel;

    private JTextField textField;
    private JPanel contentPane;

    public static void main(String args[]) {
        new Interface();
    }

    Interface() {

        frame = new JFrame("Todos");
        buttonPane = new JPanel();
        fieldsPanel = new JPanel();
        cash = new JLabel("Введите заметку");
        cashField = new JTextField();

        contentPane = new JPanel();
        textField = new JTextField();
        textField.setBackground(Color.LIGHT_GRAY);
        textField.setBounds(10, 11, 86, 20);
        contentPane.add(textField);
        textField.setColumns(10);

        JButton btnNewButton = new JButton("Save");
        btnNewButton.setBounds(100, 100, 100, 100);
        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    saveToFile(textField.getText());
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
        contentPane.add(btnNewButton);
        cancel = new JButton("Cancel");


        fieldsPanel.setLayout(new BoxLayout(fieldsPanel, BoxLayout.PAGE_AXIS));

        buttonPane.setLayout(new FlowLayout());

        fieldsPanel.add(cash);
        fieldsPanel.add(cashField);
        buttonPane.add(btnNewButton);
        buttonPane.add(cancel);
        frame.add(fieldsPanel, BorderLayout.PAGE_START);
        frame.add(buttonPane, BorderLayout.PAGE_END);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


    static void saveToFile(String text) throws IOException {
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream("/home/vladislav/IdeaProjects/ToDoList/txtfiles/Text 01.txt"));
            out.writeObject(text);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (out != null) {
                    out.flush();
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}