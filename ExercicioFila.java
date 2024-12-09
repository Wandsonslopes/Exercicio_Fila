package exercicioFila;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioFila {

	public static void main(String[] args) {

		String cliente;
		int opcao;

		Scanner leia = new Scanner(System.in);

		Queue<String> fila = new LinkedList<String>();

		System.out.println("*********************************************");
		System.out.println("");
		System.out.println("");
		System.out.println("     1 - Adicionar Cliente na Fila      ");
		System.out.println("     2 - Listar todos os clientes     ");
		System.out.println("     3 - Retirar cliente da fila      ");
		System.out.println("     0 - Sair      ");
		System.out.println("");
		System.out.println("");
		System.out.println("*********************************************");

		do {
			System.out.println("\nDigite uma opção: ");
			opcao = leia.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Digite o nome: ");
				cliente = leia.next();
				fila.add(cliente);
				System.out.println("Cliente " + cliente + " adicionado na fila!");
				break;

			case 2:
				if (fila.isEmpty()) {
					System.out.println("A fila está vazia.");
				} else {
					System.out.println("Clientes na fila :" + fila);
				}
				break;

			case 3:
				if (fila.isEmpty()) {
					System.out.println("A fila está vazia, não há clientes para chamar.");
				} else {
					String clienteChamado = fila.poll();
					System.out.println("Cliente " + clienteChamado + " foi chamado.");
				}
				break;

			case 0:
				System.out.println("Programa finalizado.");
				break;

			default:
				System.out.println("Opção inválida. Tente novamente.");
			}

		} while (opcao != 0);

	}

}
