import java.util.ArrayList;
public class oitavaquestao {
    public static void main(String[] args) {
        ArrayList <Integer> numeros = new ArrayList <> ();
        numeros.add(12);
        numeros.add(9);
        numeros.add(7);
        numeros.add(20);
        numeros.add(25);
        int somamaioresQue10 = 0;
        int multiplosde5 = 0;

        for (int numero:numeros) {
            if (numero > 10){
                somamaioresQue10 += numero;
            }
            if (numero % 5 == 0){
                multiplosde5++;
            }
        }
        System.out.println("Soma dos maior que 10=" +  somamaioresQue10);
        System.out.println("Multiplos de 5=" + multiplosde5);
    }

}
