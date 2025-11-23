public class Ex3_ClientCountSimulation {
public static void main(String[] args) {
System.out.println("Contagem de clientes na próxima hora:");
for (int i = 1; i <= 10; i++) {
System.out.println("Cliente número: " + i);
try {
Thread.sleep(200); // pausa curta para simular tempo (opcional)
} catch (InterruptedException e) {
Thread.currentThread().interrupt();
}
}
}
}
