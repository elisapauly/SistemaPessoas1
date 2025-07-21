import java.util.Scanner;

public class SistemaPessoas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pessoas[] pessoas = new Pessoas[3];

        System.out.println("=== Cadastro de 3 Pessoas ===");

        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("\nPessoa " + (i + 1));
            pessoas[i] = new Pessoas();
            pessoas[i].lerDados(scanner);
        }

        System.out.println("\n=== DADOS CADASTRADOS ===\n");

        for (Pessoas pessoa : pessoas) {
            pessoa.exibirInformacoes();
        }

        scanner.close();
    }
}
