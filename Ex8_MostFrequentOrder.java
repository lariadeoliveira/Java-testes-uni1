import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Ex8_MostFrequentOrder {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Digite os códigos dos pedidos separados por espaço (enter para terminar):");
String line = sc.nextLine();
String[] parts = line.trim().split("\\s+");
Map<String, Integer> freq = new HashMap<>();
for (String p : parts) {
if (p.isEmpty()) continue;
freq.put(p, freq.getOrDefault(p, 0) + 1);
}
String most = null;
int best = 0;
for (Map.Entry<String, Integer> e : freq.entrySet()) {
if (e.getValue() > best) {
best = e.getValue();
most = e.getKey();
}
}
if (most != null) System.out.println("Item mais pedido: " + most + " (" + best + " vezes)");
else System.out.println("Nenhum código informado.");
sc.close();
}
}
