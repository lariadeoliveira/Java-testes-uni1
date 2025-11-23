import java.util.Scanner;


public class Ex2_ProductCodeParity {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Digite o código do produto (inteiro): ");
while (!sc.hasNextInt()) {
System.out.print("Por favor, informe um número inteiro: ");
sc.next();
}
int codigo = sc.nextInt();
if (codigo % 2 == 0) {
System.out.println("O código " + codigo + " é PAR.");
} else {
System.out.println("O código " + codigo + " é ÍMPAR.");
}
sc.close();
}
}
