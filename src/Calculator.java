import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Calculator implements ActionListener {

    private JLabel exValue;
    private JFrame mainFrame;
    private JTextField eurField;
    private JButton calculate;
    private JComboBox<String> currencyList;

    CurrencyPlaceholder cp = new CurrencyPlaceholder();
    String[] currency = cp.currency;
    //String[] currency = {"PLN","USD"};
    String chosenCurrency;

    public Calculator(){

        mainFrame = new JFrame();
        exValue = new JLabel();

        eurField = new JTextField();

        calculate = new JButton("Calculate");
        calculate.addActionListener(this);

        currencyList = new JComboBox<String>(currency);
        currencyList.setMaximumSize(currencyList.getPreferredSize());
        currencyList.setAlignmentX(Component.CENTER_ALIGNMENT);


        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(90,90,50,90));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(eurField);
        panel.add(currencyList);
        panel.add(calculate);
        panel.add(exValue);

        mainFrame.add(panel, BorderLayout.CENTER);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setTitle("Currency Calculator");
        mainFrame.pack();
        mainFrame.setVisible(true);


    }

    public static void main(String[] args){

        System.out.println("Program started");
        new Calculator();

    }

    @Override
    public void actionPerformed(ActionEvent event) {
        try {
            Double eur = Double.parseDouble(eurField.getText());
            Double exRate;
            chosenCurrency = (String) currencyList.getSelectedItem();

            switch(chosenCurrency){
                case "PLN" :
                    exRate = 4.7578;
                    break;
                case "USD":
                    exRate = 0.9970;
                    break;
                case "JPY":
                    exRate = 137.02;
                    break;
                default:
                    exRate =0.0;
            }
            //label.setText(chosenCurrency);
            DecimalFormat dff = new DecimalFormat("#.####");
            Double value = eur * exRate;
            exValue.setText(String.valueOf(dff.format(value)));

        }catch(Exception e){
            exValue.setText("Please insert a valid value");
            System.out.println("An exception occurred: " + "\n" + e.getMessage());
        }
    }
}
