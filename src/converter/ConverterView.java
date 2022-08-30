package converter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

import static java.awt.BorderLayout.CENTER;

public class ConverterView extends JFrame {
    private JFrame frame;
    private JPanel panel;
    private JButton convertButton = new JButton("Convert");
    private JTextField resultTextField, inputTextField;
    private JComboBox fromComboBox, toComboBox;
    private GridLayout gridLayout;



    public ConverterView(){
        frame = new JFrame();
        panel = new JPanel();

        resultTextField = new JTextField();
        inputTextField = new JTextField();

        resultTextField.setEditable(false);
        String scale[] = {"Choose", "Celsius", "Fahrenheit", "Kelvin"};
        fromComboBox = new JComboBox(scale);
        toComboBox = new JComboBox(scale);

        panel.setBorder(BorderFactory.createEmptyBorder(20, 20,
                50, 20));
        // setting grid layout of 3 rows and 3 columns
        gridLayout = new GridLayout(0, 4,5,5);
        panel.setLayout(gridLayout);

        panel.add(new JLabel("CONVERT TEMPERATURE")); panel.add(new JLabel("")); panel.add(new JLabel("")); panel.add(new JLabel(""));
        panel.add(new JLabel("FROM")); panel.add(fromComboBox); panel.add(new JLabel("TO")); panel.add(toComboBox);
        panel.add(new JLabel("")); panel.add(inputTextField); panel.add(new JLabel("")); panel.add(resultTextField);
        panel.add(new JLabel("")); panel.add(new JLabel("")); panel.add(new JLabel("")); panel.add(new JLabel(""));
        panel.add(new JLabel("")); panel.add(new JLabel("")); panel.add(new JLabel("")); panel.add(convertButton);

        frame.add(panel, CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Temperature Converter");
        frame.pack();
        frame.setVisible(true);
    }

    public JComboBox getFromComboBox() {
        return fromComboBox;
    }

    public JComboBox getToComboBox() {
        return toComboBox;
    }

    public int getInputTextField() {
        return Integer.parseInt(inputTextField.getText());
    }
    void convertValues(ActionListener listener){
        convertButton.addActionListener(listener);
    }
    public void setCalcSolution(float solution){
        resultTextField.setText(Float.toString(solution));
    }

    void displayErrorMessage(String errorMessage){
        JOptionPane.showMessageDialog(this,errorMessage);
    }
}
