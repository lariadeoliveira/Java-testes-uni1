public class Ex6_PrimesTo100 {
public static void main(String[] args) {
System.out.println("Números primos entre 1 e 100:");
for (int i = 2; i <= 100; i++) {
if (ehPrimo(i)) System.out.print(i + " ");
}
System.out.println();
}


private static boolean ehPrimo(int n) {
if (n <= 1) return false;
if (n <= 3) return true;
if (n % 2 == 0) return false;
for (int i = 3; i * i <= n; i += 2) {
if (n % i == 0) return false;
}
return true;
}
}
