public class Ex5_MaxGradeFinder {
public static void main(String[] args) {
double[] notas = {7.5, 9.0, 6.3, 8.8, 10.0, 5.0};
double maior = Double.NEGATIVE_INFINITY;
for (double n : notas) {
if (n > maior) maior = n;
}
System.out.println("Notas da turma:");
for (double n : notas) System.out.print(n + " ");
System.out.println("\nMaior nota: " + maior);
}
}
