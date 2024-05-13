package fila;
import java.util.Scanner;
import java.util.Stack;
public class ExercicioPilha {

	public static void main(String[] args) {
		
		 Scanner leia = new Scanner(System.in);

	        
	        Stack<String> pilhaLivros = new Stack<>();

	        int opcao;

	        do {
	           
	            System.out.println("**********************************************");
	            System.out.println("1: Adicionar livro na pilha");
	            System.out.println("2: Listar todos os livros");
	            System.out.println("3: Retirar um livro da pilha");
	            System.out.println("0: Sair do programa");
	            System.out.println("**********************************************");
	            System.out.print("\nEntre com a opção desejada: ");
	            opcao = leia.nextInt();

	            switch (opcao) {
	                case 1:
	                    leia.nextLine(); 
	                    System.out.print("Digite o nome do livro: ");
	                    String novoLivro = leia.nextLine();
	                    pilhaLivros.push(novoLivro); 
	                    System.out.println("\nLivro adicionado!");
	                    break;
	                case 2:
	                    listarLivrosNaPilha(pilhaLivros);
	                    break;
	                case 3:
	                    retirarLivroDaPilha(pilhaLivros);
	                    break;
	                case 0:
	                    System.out.println("\nPrograma Finalizado!");
	                    break;
	                default:
	                    System.out.println("\nOpção inválida! Por favor, digite uma opção válida.");
	            }

	        } while (opcao != 0);
	    }

	   
	    private static void listarLivrosNaPilha(Stack<String> pilhaLivros) {
	        System.out.println("\nPilha:");
	        for (String livro : pilhaLivros) {
	            System.out.println(livro);
	        }
	    }

	   
	    private static void retirarLivroDaPilha(Stack<String> pilhaLivros) {
	        if (!pilhaLivros.isEmpty()) {
	            String livroRetirado = pilhaLivros.pop(); 
	            System.out.println("\nUm livro foi retirado da pilha!");
	        } else {
	            System.out.println("\nA pilha está vazia!");
	        }
	}

}
