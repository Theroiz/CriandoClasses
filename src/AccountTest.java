import javax.swing.JOptionPane;
public class AccountTest {
    public static double conta(double valor)
    {
        double saldo = 5000.00d;
        if(valor > saldo)
        {
            JOptionPane.showMessageDialog(null,"O valor a ser retirado excede o valor atual em sua conta");
        }else if(valor <= 0)
        {
            JOptionPane.showMessageDialog(null, saldo == 0 ? "Nao e possivel retirar nada de seu saldo": "O valor a ser retirado e negativo");
        }else
        {
            saldo =- valor;
        }
        return saldo;
    }
}
