import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Pessoa {
private String nome;
private int idade;
private String endereco;


public Pessoa(String nome, int idade, String endereco) {
this.nome = nome;
this.idade = idade;
this.endereco = endereco;
}


@Override
public String toString() {
return nome + " (" + idade + " anos) - " + endereco;
}
}


public class Ex9_PersonRegistry {
public static void main(String[] args) {
List<Pessoa> lista = new ArrayList<>();
Scanner sc = new Scanner(System.in);
boolean run = true;
while (run) {
System.out.println("\n1-Adicionar 2-Listar 0-Sair");
int opcao = sc.nextInt(); sc.nextLine();
switch (opcao) {
case 1:
System.out.print("Nome: ");
String nome = sc.nextLine();
