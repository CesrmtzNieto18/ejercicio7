import javax.swing.JOptionPane;

public class Ejercico_No7 {
    public static void main(String args[]) {
        double Nota;
        while (true){
        char NuevaNota = ' ';

       
        Nota = Byte.parseByte(JOptionPane.showInputDialog("Favor de ingresar su nota (1-20):"));
        if (Nota >= 19 || Nota <= 20) {
            NuevaNota = 'A';
        } else if (Nota >= 16 || Nota <= 18) {
            NuevaNota = 'B';
        } else if (Nota >= 13 || Nota <= 15) {
            NuevaNota = 'C';
        } else if (Nota >= 10 || Nota <= 12) {
            NuevaNota = 'D';
        } else if (Nota >= 1 || Nota <= 9) {
            NuevaNota = 'E';
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese valores del 1 al 20.");
            return; 
        }
        JOptionPane.showMessageDialog(null, "Su nueva nota es: " + NuevaNota);
        System.out.println("Registro: " + Nota);
        System.out.println("Nota: " + NuevaNota);
    }
}
}