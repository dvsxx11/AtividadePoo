import java.util.ArrayList;
public class decimaquestao {
    public static void main(String[] args) {
        ArrayList<Integer> notas = new ArrayList<>();
    notas.add(92);
    notas.add(82);
    notas.add(72);
    notas.add(52);
    notas.add(32);
        for (int i = 0; i < notas.size(); i++) {
            int nota = notas.get(i);
            System.out.println("Nota=" + nota);

        if (nota >= 92) {
            System.out.println("Aprovado com excelência");
        }else if (nota >= 82) {
            System.out.println("Aprovado");
        }else if (nota >= 72) {
            System.out.println("Aprovado");
        }else if (nota >= 52) {
            System.out.println("Recuperação");
        }else if (nota >= 32) {
            System.out.println("Reprovado");
        }
        }
    }
    
}
