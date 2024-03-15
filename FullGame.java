
/**
 * Escreva uma descrição da classe FullGame aqui.
 * 
 * @author (Duarte Jacinto)
 * @author (Tiago Reis) 
 * @version (15-03-2024)
 */

public class FullGame
{
    private WordGuessingGame wordGuessingGame;
    private InputReader inputReader;

    public FullGame() {
        wordGuessingGame = new WordGuessingGame();
        inputReader = new InputReader();
    }

    public void play() {
        char choice = 'a';
        while (choice != 'n') {
            wordGuessingGame.play();
            System.out.println("| Deseja jogar novamente?");
            System.out.println("| 's' => Sim");
            System.out.println("| 'n' => Não");
            choice = inputReader.getChar(null);
            wordGuessingGame.reset();
        }
        System.out.println("O jogo terminou...");
    }
}
