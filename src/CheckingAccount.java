import java.util.Scanner;
import javax.swing.JOptionPane;
public class CheckingAccount {
    public static void main(String[]args)
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira um valor a ser sacado");
        double valor = entrada.nextDouble();
        AccountTest.conta(valor);
        JOptionPane.showMessageDialog(null,valor >= 2 ? "Foram sacados "+AccountTest.conta(valor)+" De sua conta" : "Foi sacado "+AccountTest.conta(valor)+" de sua conta");
    }
}
