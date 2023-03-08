import java.util.Scanner;

public class MarsRover {
    public static void main(String[] args) {
        int position = 0; // posição inicial do rover é 0
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a sequência de comandos (d ou e exemplo: ddede): ");
        String commands = scanner.nextLine();
        
        // percorre a sequência de comandos e atualiza a posição do rover
        for (int i = 0; i < commands.length(); i++) {
            char command = commands.charAt(i);
            if (command == 'd') {
                if (position < 5) {
                    position++; // move para a direita (+1)
                } else {
                    System.out.println("Não é possível se mover para a direita após a o trilho " + position);
                    return;
                }
            } else if (command == 'e') {
                if (position == 0) {
                    System.out.println("Não é possível se mover para a esquerda a partir da posição " + position);
                    return;
                } else {
                    position--; // move para a esquerda (-1)
                }
            } else {
                System.out.println("Comando inválido: " + command);
                return;
            }
        }
        
        System.out.println("Posição final do rover: " + position);
    }
}


