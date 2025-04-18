import java.util.Scanner;
public class quintaquestao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de x: ");
        int x = sc.nextInt();
        System.out.println("Digite o valor de y: ");
        int y = sc.nextInt();

        if (x > y) {
            int temp = x;
            x = y;
            y = temp;
        }

        int soma = 0;
        while (x <= y) {
            soma += x;
            x++;
        }

        System.out.println(soma);
        sc.close();
    }
}
