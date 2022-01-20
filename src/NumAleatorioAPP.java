import javax.swing.JOptionPane;

public class NumAleatorioAPP {

	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Introduce el valor limite");
		int limite = Integer.parseInt(valor);
		String valor1 = JOptionPane.showInputDialog("Introduce un numero");
		int numero1 = Integer.parseInt(valor1);
		String valor2 = JOptionPane.showInputDialog("Introduce un numero");
		int numero2 = Integer.parseInt(valor2);
		
		for(int i = 0; i < limite; i++) {
			System.out.println(generaNumero(numero1, numero2));
		}
	}
	
	public static int generaNumero(int numero1, int numero2) {
		return ((int)Math.floor(Math.random() * (numero2 - numero1) + numero1));	
	}
}
