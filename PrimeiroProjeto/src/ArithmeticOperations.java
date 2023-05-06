import javax.swing.JOptionPane;

public class ArithmeticOperations {
    public static void main(String[] args) {
        int numeroA = 5;
        int numeroB = 6;

        int resultado = numeroA + numeroB;

        JOptionPane.showMessageDialog(null, resultado, "Matematica", JOptionPane.INFORMATION_MESSAGE);

        // Resto, Quando o resto eh 0 eh par quando o resto eh 1 eh impar
        int resto = 10 % 2;
        
    }
    
}
