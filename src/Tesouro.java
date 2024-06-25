import java.util.Scanner;
import javax.swing.JOptionPane;
public class Tesouro {
    
    public static void main(String[]args)
    {
        compraTesouro();
    }
    public static void compraTesouro()
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira um periodo de investimento\n0-11 meses: 0,5%\n12-23 meses: 1,0%\n24-35 meses:1,5%\n36-47 meses: 2,0%\n48-60 meses: 2,5%");
        int periodoTesouro = entrada.nextInt();
        System.out.println("Insira um valor a ser investido no tesouro");
        double valorTesouro = entrada.nextDouble();
        double rendimentoTesouro = 0;
        if(periodoTesouro >= 0 && periodoTesouro <= 11)
        {
            rendimentoTesouro = valorTesouro + valorTesouro * 0.5;
        }else if(periodoTesouro >= 12 && periodoTesouro <= 23)
        {
            rendimentoTesouro = valorTesouro + valorTesouro * 1.0;
        }else if(periodoTesouro >= 24 && periodoTesouro <= 35)
        {
            rendimentoTesouro = valorTesouro + valorTesouro * 1.5;
        }else if(periodoTesouro >= 36 && periodoTesouro <= 47)
        {
            rendimentoTesouro = valorTesouro + valorTesouro * 2.0;
        }else if(periodoTesouro >= 48 && periodoTesouro <= 60)
        {
            rendimentoTesouro = valorTesouro + valorTesouro * 2.5;
        }else
        {
            JOptionPane.showMessageDialog(null, "Valor invalido!");
        }
        System.out.println(valorTesouro <= 2 && valorTesouro > 0 ? periodoTesouro+"O periodo de "+" meses com "+valorTesouro+" investido ira render "+rendimentoTesouro : "O periodo de "+periodoTesouro+" meses com "+valorTesouro+" investidos ira render "+rendimentoTesouro);
        entrada.close();
    }
}