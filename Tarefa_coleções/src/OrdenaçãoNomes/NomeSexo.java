package OrdenaçãoNomes;

import java.util.*;

public class NomeSexo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite os nomes e os sexos separados por '-' (Exemplo: Maria-F;João-M;Ana-F): ");
        String input = scanner.nextLine();

        String[] pessoas = input.split(",");
        List<String> mulheres = new ArrayList<>();
        List<String> homens = new ArrayList<>();

        for (String pessoa : pessoas) {
            String[] dados = pessoa.split("-");
            String nome = dados[0].trim();
            String sexo = dados[1].trim();
            if (sexo.equalsIgnoreCase("F")) {
                mulheres.add(nome);
            } else if (sexo.equalsIgnoreCase("M")) {
                homens.add(nome);
            }
        }

        Collections.sort(mulheres);
        Collections.sort(homens);

        System.out.println("Mulheres:");
        for (String mulher : mulheres) {
            System.out.println(mulher);
        }

        System.out.println("\nHomens:");
        for (String homem : homens) {
            System.out.println(homem);
        }

        scanner.close();
    }
}