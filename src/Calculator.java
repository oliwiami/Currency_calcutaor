import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Calculator implements ActionListener {

    private JLabel exValue, eurLabel, chCurrency;
    private JFrame mainFrame;
    private JTextField eurField;
    private JButton calculate;
    private JComboBox<String> currencyList;

    String[] currency, rates;
    String chosenCurrency;

    Parser parser = new Parser();

    public Calculator(){

        parser.parse();
        currency = parser.countryList;
        rates = parser.rateList;

        mainFrame = new JFrame();
        exValue = new JLabel();
        eurLabel = new JLabel();
        eurLabel.setText("EUR:");
        chCurrency = new JLabel();
        chCurrency.setText("Choose Currency:");

        eurField = new JTextField();

        calculate = new JButton("Calculate");
        calculate.addActionListener(this);

        currencyList = new JComboBox<>(currency);
        currencyList.setMaximumSize(currencyList.getPreferredSize());
        currencyList.setAlignmentX(Component.CENTER_ALIGNMENT);


        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(100,100,60,100));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(eurLabel);
        panel.add(eurField);
        panel.add(chCurrency);
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
            Double exRate=0.0;

            chosenCurrency = (String) currencyList.getSelectedItem();

            for(int i=0; i<currency.length; i++){
                if(currency[i].equals(chosenCurrency)){
                    exRate = Double.parseDouble(rates[i]);
                    break;
                }
            }

            DecimalFormat dff = new DecimalFormat("#.####");
            Double value = eur * exRate;
            exValue.setText(" = " + (dff.format(value)) + " " + chosenCurrency);

        }catch(Exception e){
            exValue.setText("Invalid value");
            System.out.println("An exception occurred: " + "\n" + e.getMessage());
        }
    }

}
