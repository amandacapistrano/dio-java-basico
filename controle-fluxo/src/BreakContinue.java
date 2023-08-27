public class BreakContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero <=5; numero ++){
            if(numero == 3)
                //O break faz imprimir só até o 2.
                //break;
                //O continue pula o número 3, porque quando chega no cotinue ele volta para o for sem chegar no sout
                continue;

            System.out.println(numero);
        }
    }
}
