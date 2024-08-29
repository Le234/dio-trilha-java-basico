
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String nomeCliente;
        String agencia = "";
        double saldo = 237.48; 
           
           System.out.println("Por favor, digite o número da Agência !");
                agencia = new Scanner(System.in) .nextLine();
            System.out.println("Por favor, digite o número da Conta !");
                numero = new Scanner(System.in) .nextInt();
            System.out.println("Por favor, digite seu Nome !");
                nomeCliente = new Scanner(System.in). nextLine();
                System.out.println("Olá " + nomeCliente + "\n"
                +"obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + "\n"
                +"conta: "+ numero + "\n"
                +"e seu saldo " + saldo + " já está disponível para saque ");
     }
}
