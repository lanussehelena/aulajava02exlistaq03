import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao calculador de médias do Aluno: ");
        String resposta;
        double soma = 0;
        int quantidadeNotas = 0;

        do {
            System.out.println("Insira uma nota do aluno: ");
            double nota = scanner.nextDouble();
            soma += nota;
            quantidadeNotas++;

            scanner.nextLine();

            System.out.println("Deseja inserir uma outra nota? (Digite 'S' para Sim e 'N' para Não): ");
            resposta = scanner.nextLine().toLowerCase();

        } while(resposta.equals("s"));

        double media = soma / quantidadeNotas;

        System.out.println(("Média das notas: " + media));

        scanner.close();
    }
}