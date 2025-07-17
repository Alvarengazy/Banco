import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá Cliente, por favor, insira o numero da sua conta");
        int numero = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Por favor, insira sua Agência");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, insira a quantia na qual deseja depositar");
        double quantia = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Agora digite como gostaria de ser chamado");
        String apelido = scanner.nextLine();
        
       System.out.printf(
        "Muito obrigado por criar sua conta, %s!\nAgência: %s\nConta: %d\nQuantia: %.2f\n", 
        apelido, agencia, numero, quantia 
        );

    }
}