package fila;

import java.util.LinkedList;

import java.util.Queue;
import java.util.Scanner;

public class Exercicio1Fila {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

        
        Queue<String> filaClientes = new LinkedList<>();

        int opcao;

        do {
            
            System.out.println("*******************************************");
            System.out.println("1: Adicionar Cliente na fila");
            System.out.println("2: Listar todos os Clientes ");
            System.out.println("3: Retirar cliente da fila");
            System.out.println("0: Sair do programa");
            System.out.println("*******************************************");
            System.out.print("\nEntre com a opção desejada: ");
            opcao = leia.nextInt();

            switch (opcao) {
                case 1:
                    leia.nextLine(); 
                    System.out.print("Digite o nome do Cliente: ");
                    String novoCliente = leia.nextLine();
                    filaClientes.offer(novoCliente); 
                    System.out.println("\nCliente Adicionado!");
                    break;
                case 2:
                    listarClientesNaFila(filaClientes);
                    break;
                case 3:
                    chamarProximoCliente(filaClientes);
                    break;
                case 0:
                    System.out.println("\nPrograma Finalizado!");
                    break;
                default:
                    System.out.println("\nOpção inválida! Por favor, digite uma opção válida.");
            }

        } while (opcao != 0);
    }

   
    private static void listarClientesNaFila(Queue<String> filaClientes) {
        System.out.println("\nFila:");
        for (String cliente : filaClientes) {
            System.out.println(cliente);
        }
    }

    
    private static void chamarProximoCliente(Queue<String> filaClientes) {
        if (!filaClientes.isEmpty()) {
            String proximoCliente = filaClientes.poll(); 
            System.out.println("\nO Cliente " + proximoCliente + " foi Chamado!");
        } else {
            System.out.println("\nA Fila está vazia!");
		
        }
	}
	}
