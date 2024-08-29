import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Por favor digite seu nome completo: ");
        String nomeCliente = scan.nextLine();       

        System.out.println("Por favor digite o número da agência: ");
        String agencia = scan.nextLine();

        System.out.println("Por favor digite o número da sua conta: ");
        int numeroConta = scan.nextInt(); 
        
        System.out.println("Por favor digite o saldo que gostaria de depositar: ");
        double saldo = scan.nextDouble();

        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        String valorFormatado  = formatoMoeda.format(saldo);
        

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
        ", " + "conta " + numeroConta +  " e seu saldo " + formatoMoeda.format(saldo) + " já está disponível para saque.");


        scan.close();
    }
}
