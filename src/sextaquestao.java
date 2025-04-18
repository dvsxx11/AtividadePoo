public class sextaquestao {
    public static void main(String[] args) {
        int[] numeros = {10, 6, 8, 4, 2};
        int contadorPares = 0;

        System.out.println("Números maiores que 7:");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 7) {
                System.out.println(numeros[i]);

                if (numeros[i] % 2 == 0) {
                    contadorPares++;
                }
            }
        }

        System.out.println("Quantidade de números maiores que 7 e pares: " + contadorPares);
    }
}
