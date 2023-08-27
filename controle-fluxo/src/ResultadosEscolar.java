public class ResultadosEscolar {
    public static void main(String[] args) {
        //operador ternário
        int nota =5;
        String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
    }
}
