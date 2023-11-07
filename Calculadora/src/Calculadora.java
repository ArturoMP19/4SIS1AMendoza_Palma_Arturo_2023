
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Math;

public class Calculadora extends JFrame implements ActionListener {
    private final JTextField display;
    private double num1, num2;
    private String operacion;

    public Calculadora() {
        num1 = 0;
        num2 = 0;
        operacion = "";

        setTitle("Calculadora");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        display = new JTextField(10);
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 4));

        String[] botones = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+",
            "sin", "cos", "tan", "sqrt", "x^2",
            "C"
        };

        for (String boton : botones) {
            JButton btn = new JButton(boton);
            btn.addActionListener(this);
            panel.add(btn);
        }

        add(panel, BorderLayout.CENTER);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();

        if (comando.matches("[0-9]")) {
            display.setText(display.getText() + comando);
        } else if (comando.equals(".")) {
            if (!display.getText().contains(".")) {
                display.setText(display.getText() + comando);
            }
        } else if (comando.matches("[+\\-*/]")) {
            num1 = Double.parseDouble(display.getText());
            operacion = comando;
            display.setText("");
        } else if (comando.equals("=")) {
            num2 = Double.parseDouble(display.getText());
            double resultado = calcular(num1, num2, operacion);
            display.setText(Double.toString(resultado));
        } else if (comando.equals("sin")) {
            num1 = Double.parseDouble(display.getText());
            double resultado = Math.sin(Math.toRadians(num1));
            display.setText(Double.toString(resultado));
        } else if (comando.equals("cos")) {
            num1 = Double.parseDouble(display.getText());
            double resultado = Math.cos(Math.toRadians(num1));
            display.setText(Double.toString(resultado));
        } else if (comando.equals("tan")) {
            num1 = Double.parseDouble(display.getText());
            double resultado = Math.tan(Math.toRadians(num1));
            display.setText(Double.toString(resultado));
        } else if (comando.equals("sqrt")) {
            num1 = Double.parseDouble(display.getText());
            if (num1 >= 0) {
                double resultado = Math.sqrt(num1);
                display.setText(Double.toString(resultado));
            } else {
                display.setText("Error");
            }
        } else if (comando.equals("x^2")) {
            num1 = Double.parseDouble(display.getText());
            double resultado = Math.pow(num1, 2);
            display.setText(Double.toString(resultado));
        } else if (comando.equals("C")){
        display.setText("");
        }
    }

    private double calcular(double num1, double num2, String operacion) {
        switch (operacion) {
            case "+" -> {
                return num1 + num2;
            }
            case "-" -> {
                return num1 - num2;
            }
            case "*" -> {
                return num1 * num2;
            }
            case "/" -> {
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    return Double.NaN; // División por cero
                }
            }
            default -> {
                return Double.NaN; // Operación no válida
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Calculadora());
    }
}

