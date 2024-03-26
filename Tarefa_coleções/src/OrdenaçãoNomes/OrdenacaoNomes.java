package OrdenaçãoNomes;

import java.util.*;

public class OrdenacaoNomes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite os nomes separados por vírgula: ");

        String input = scanner.nextLine();

        String[] nomes = input.split(",");

        List<String> listaNomes = new ArrayList<>();
        for (String nome : nomes) {
            listaNomes.add(nome.trim());
        }
        Collections.sort(listaNomes);
        System.out.println("Nomes em ordem alfabética:");
        for (String nome : listaNomes) {
            System.out.println(nome);
        }

        scanner.close();
    }
}
