import java.util.Scanner;
if (r < 0 || r > 2 || c < 0 || c > 2 || board[r][c] != ' ') {
System.out.println("Jogada inválida. Tente novamente.");
continue;
}
board[r][c] = player;
if (checaVencedor(player)) {
printBoard();
System.out.println("Jogador " + player + " venceu!");
break;
}
if (isFull()) {
printBoard();
System.out.println("Empate!");
break;
}
player = (player == 'X') ? 'O' : 'X';
}
sc.close();
}


private static void resetBoard() {
for (int i = 0; i < 3; i++)
for (int j = 0; j < 3; j++)
board[i][j] = ' ';
}


private static void printBoard() {
System.out.println("\nTabuleiro:");
for (int i = 0; i < 3; i++) {
System.out.println(" " + board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
if (i < 2) System.out.println("---+---+---");
}
}


private static boolean checaVencedor(char p) {
// linhas e colunas
for (int i = 0; i < 3; i++) {
if (board[i][0] == p && board[i][1] == p && board[i][2] == p) return true;
if (board[0][i] == p && board[1][i] == p && board[2][i] == p) return true;
}
// diagonais
if (board[0][0] == p && board[1][1] == p && board[2][2] == p) return true;
if (board[0][2] == p && board[1][1] == p && board[2][0] == p) return true;
return false;
}


private static boolean isFull() {
for (int i = 0; i < 3; i++)
for (int j = 0; j < 3; j++)
if (board[i][j] == ' ') return false;
return true;
}
}
