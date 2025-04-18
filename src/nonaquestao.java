import java.util.ArrayList;
public class nonaquestao {
    public static void main(String[] args) {
        ArrayList<String> alunos = new ArrayList<>();
        alunos.add("Ana");
        alunos.add("Roberto");
        alunos.add("Letícia");
        alunos.add("Natalia");
        int i = 0;
        while (i < alunos.size()) {
            String nome = alunos.get(i);
            if(nome.length() > 5){
                System.out.println(nome);
            }
            i++;
        }
    }
}
