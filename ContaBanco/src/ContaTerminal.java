import java.util.Scanner;

public class ContaTerminal {
    public int numero;
    public String agencia;
    public String nomeCliente;
    public double saldo;

    //TODO: CONHECER E IMPORTAR A CLASSE SCANNER
        Scanner ler = new Scanner(System.in);

        //EXIBIR AS MENSAGENS PARA O NOSSO USUARIO
        
        //OBTER PELA SCANNER OS VALORES DIGITADOS NO TERMINAL
    public void cadastro(){
        System.out.println("Digite o número da conta: ");
        this.numero = ler.nextInt();
        ler.nextLine();
        System.out.println("Digite o número da agência: ");
        this.agencia = ler.nextLine();

        System.out.println("Digite seu nome: ");
        this.nomeCliente = ler.nextLine();

        System.out.println("Digite seu saldo: ");
        this.saldo = ler.nextDouble();
    }

    //EXIBIR A MENSAGEM CONTA CRIADA
    public void consulta(){
        System.out.println("Olá " + this.nomeCliente + ", obrigada por criar uma conta em nosso banco, sua agência é "+ this.agencia + ", conta "+this.numero + " e seu saldo R$ "+ this.saldo + " já está disponível para saque.");
    }
    public static void main(String[] args) {
       ContaTerminal conta1 = new ContaTerminal();
       conta1.cadastro();
       conta1.consulta();

    }
}

