package dio;

import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {

    private Integer number;
    private String agency;
    private String clientName;
    private BigDecimal balance;

    public ContaTerminal(Integer number, String agency, String clientName, BigDecimal balance) {
        this.number = number;
        this.agency = agency;
        this.clientName = clientName;
        this.balance = balance;
    }



    @Override
    public String toString() {
        return "Olá " + clientName +
                ", obrigado por criar uma conta em nosso banco" +
                ", sua agência é " + agency +
                ", conta " + number +
                " e seu saldo " + balance +
                " já está disponível para saque.";
    }


    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o nome do cliente !");
        String clientName = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta !");
        Integer number = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência !");
        String agency = scanner.next();

        System.out.println("Por favor, digite o saldo da conta !");
        BigDecimal balance = scanner.nextBigDecimal();

        ContaTerminal conta = new ContaTerminal(number, agency, clientName, balance);
        System.out.println(conta);
    }
}
