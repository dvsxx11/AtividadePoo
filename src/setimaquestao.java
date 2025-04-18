public class setimaquestao {
    public static void main(String[] args) {
        String[] frutas = {"Maçã", "Banana", "Laranja", "Abacaxi", "Melancia"};

        for (int i = 0; i < frutas.length; i++) {
            String fruta = frutas[i];

            switch (fruta) {
                case "Maçã":
                case "Melancia":
                    System.out.println("Fruta vermelha-" + fruta);
                    break;
                    case "Banana":
                        System.out.println("Fruta amarela-" + fruta);
                        break;
                        case "Laranja":
                            System.out.println("Fruta Sitrica-" + fruta);
                            break;
                            default:
                                System.out.println("Outras Frutas-" + fruta);
                                break;
                    }
                }
            }
        }
