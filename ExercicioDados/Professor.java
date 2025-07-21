import java.util.Scanner;

public class Professor extends Pessoas{

    private String nome;
    private String sobrenome;
    private String genero;
    private int idade;
    private String numeroTelefone;
    private String endereco;

    public Professor() {}

    public void lerDados(Scanner scanner) {
        System.out.print("Nome: ");
        this.nome = scanner.nextLine();

        System.out.print("Sobrenome: ");
        this.sobrenome = scanner.nextLine();

        System.out.print("Gênero: ");
        this.genero = scanner.nextLine();

        System.out.print("Idade: ");
        this.idade = Integer.parseInt(scanner.nextLine());

        System.out.print("Número de Telefone: ");
        this.numeroTelefone = scanner.nextLine();

        System.out.print("Endereço: ");
        this.endereco = scanner.nextLine();
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("Gênero: " + genero);
        System.out.println("Idade: " + idade);
        System.out.println("Telefone: " + numeroTelefone);
        System.out.println("Endereço: " + endereco);
        System.out.println("--------------------------");
    
}
    }

    