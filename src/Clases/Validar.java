package Clases;

import javax.swing.JOptionPane;

public class Validar {

    public float esFloat(String num) {
        float valorReturn = 0;
        try {
            valorReturn = Float.parseFloat(num);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El Valor escrito es Incorrecto");
        }
        return valorReturn;
    }

    public int esInt(String num) {
        int valorReturn = 0;
        try {
            valorReturn = Integer.parseInt(num);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El Valor escrito es Incorrecto");
        }
        return valorReturn;
    }
}
