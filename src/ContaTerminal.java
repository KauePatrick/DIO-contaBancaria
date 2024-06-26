import java.util.Scanner;
import java.util.Locale;


public class ContaTerminal {
    public static void main(String[] args){

        int numero;
        String agencia;
        String nome;
        double saldo;


        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("Digite seu nome: ");
         nome = scanner.next();

        System.out.println(nome + ", digite o número da Agência: ");
         agencia = scanner.next();

         System.out.println(nome +", digite o número Conta: ");
         numero = scanner.nextInt();

         System.out.println(nome +", digite o valor do saldo: ");
         saldo = scanner.nextDouble();


         System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo $" + saldo + " já está disponível para saque");



    }
}
