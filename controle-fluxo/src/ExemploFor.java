public class ExemploFor {
    public static void main(String[] args) {
        for(int carneirinhos = 1; carneirinhos <=8; carneirinhos ++){
            System.out.println("Contando carneirinhos " + carneirinhos);
        }
        //EXEMPLO COM ARRAY
        String alunos[] = {"Maria", "João", "Julia", "Flávio"};

        for (int x=0; x<alunos.length; x++){
            System.out.println("O aluno do indice x= "+ x + " é "+ alunos[x]);
        }
    
        for(String aluno: alunos){
            System.out.println("Nome do aluno é: " + aluno);
        }
    
    }

}
