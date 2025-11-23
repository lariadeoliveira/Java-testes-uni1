import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Ex4_WaitListManager {
public static void main(String[] args) {
List<String> fila = new ArrayList<>();
Scanner sc = new Scanner(System.in);
boolean running = true;


while (running) {
System.out.println("\n=== Lista de Espera ===");
System.out.println("1 - Adicionar cliente");
System.out.println("2 - Remover cliente");
System.out.println("3 - Ver lista");
System.out.println("0 - Sair");
System.out.print("Escolha: ");


int opcao = -1;
if (sc.hasNextInt()) opcao = sc.nextInt(); else sc.next();
sc.nextLine();


switch (opcao) {
case 1:
System.out.print("Nome do cliente para adicionar: ");
String nome = sc.nextLine();
fila.add(nome);
System.out.println(nome + " adicionado(a) à lista.");
break;
case 2:
if (fila.isEmpty()) {
System.out.println("A lista está vazia.");
} else {
System.out.print("Nome do cliente para remover: ");
String remover = sc.nextLine();
if (fila.remove(remover)) System.out.println(remover + " removido(a).");
else System.out.println("Nome não encontrado na lista.");
}
break;
case 3:
System.out.println("Lista atual: " + fila);
break;
case 0:
running = false; break;
default:
System.out.println("Opção inválida.");
}
}
sc.close();
System.out.println("Encerrando gerenciador de lista de espera.");
}
}
