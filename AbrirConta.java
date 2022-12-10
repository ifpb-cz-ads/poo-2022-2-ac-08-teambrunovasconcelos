import java.util.Scanner;

public class AbrirConta {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Conta c = null;
        Cliente novoCliente = null;

        System.out.println("Digite 1 para abrir uma Conta Especial");
        System.out.println("Digite 2 para abrir uma Conta Poupança");

        int input = scan.nextInt();

        switch (input) {
            case 1:
                novoCliente = new Cliente("Bruno", "123.789.874-45");
                c = new ContaEspecial(45621, novoCliente, 300);
                System.out.println("Conta Especial criada com sucesso em nome de " + c.getTitular());
                c.imprimirTipoConta();
                break;
            case 2:
                novoCliente = new Cliente("Bruno", "123.456.789-12");
                c = new ContaPoupanca(789654, novoCliente);
                System.out.println("Conta Poupança criada com sucesso em nome de " + c.getTitular());
                c.imprimirTipoConta();
                break;
        }

        scan.close();

    }
}
