import java.io.*;
import java.util.Scanner; // biblioteca de input

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        // Muito mais eficiente que o Scanner
        BufferedReader input = new BufferedReader( new InputStreamReader(System.in) ); // input eh objeto para controle de Entrada

        int num;
        String agenc;
        String nome;
        double sld;

        System.out.println("Infome o numero da conta: ");
        num = Integer.parseInt( input.readLine() );

        System.out.println("Infome o numero da agencia: ");
        agenc = input.readLine();

        System.out.println("Infome o nome do cliente: ");
        nome = input.readLine();

        System.out.println("Infome o saldo da conta: ");
        sld = Double.parseDouble( input.readLine() );

        // Criando a conta
        ContaBancaria conta1 = new ContaBancaria(num, agenc, nome, sld);

        input.close();

    }
}


class ContaBancaria {

    private int _numero;
    private String _agencia;
    private String _nome_cliente;
    private double _saldo;

    // Contrutor da classe ContaBancaria
    ContaBancaria(int num, String agency, String name, double balance) {
        _numero = num;
        _agencia = agency;
        _nome_cliente = name;
        _saldo = balance;

        mensagemCriacao();
    }

    // --- Metodos

    public void mensagemCriacao() {

        System.out.println("");
        System.out.println("Olá " + getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é " 
                            + getAgencia() + ", conta " + getNumero() + " e seu saldo " 
                            + getSaldo() + " já está disponível para saque.\n");
    }
    
    public int getNumero() {
        return _numero;
    }

    public String getAgencia() {
        return _agencia;
    }

    public String getNomeCliente() {
        return _nome_cliente;
    }

    public double getSaldo() {
        return _saldo;
    }

}

