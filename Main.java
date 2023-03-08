import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int position = 0; // posição inicial do rover é 0
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a sequência de comandos (DIREITA|ESQUERDA|CIMA|BAIXO): ");
        String commands = scanner.nextLine();
        
        // percorre a sequência de comandos e atualiza a posição do rover
        for (int i = 0; i < commands.length(); i++) {
            char command = commands.charAt(i);
            switch (command) {
                case 'd':
                    if (position % 4 < 3) {
                        position++; // move para a direita (+1)
                    } else {
                        System.out.println("Não é possível se mover para a direita a partir da posição " + position);
                        return;
                    }
                    break;
                case 'e':
                    if (position % 4 > 0) {
                        position--; // move para a esquerda (-1)
                    } else {
                        System.out.println("Não é possível se mover para a esquerda a partir da posição " + position);
                        return;
                    }
                    break;
                case 'c':
                    if (position / 4 > 0) {
                        position -= 4; // move para cima (-4)
                    } else {
                        System.out.println("Não é possível se mover para cima a partir da posição " + position);
                        return;
                    }
                    break;
                case 'b':
                    if (position / 4 < 3) {
                        position += 4; // move para baixo (+4)
                    } else {
                        System.out.println("Não é possível se mover para baixo a partir da posição " + position);
                        return;
                    }
                    break;
                default:
                    System.out.println("Comando inválido: " + command);
                    return;
            }
        }
        
        System.out.println("Posição final do rover: " + position);
    }
}





