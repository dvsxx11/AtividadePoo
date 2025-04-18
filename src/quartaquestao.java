import java.util.Scanner;
public class quartaquestao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de x: ");
        int x = sc.nextInt();

        System.out.print("Digite o valor de y: ");
        int y = sc.nextInt();

        System.out.println("Números pares entre " + x + " e " + y + ":");
        for (int i = x; i <= y; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
