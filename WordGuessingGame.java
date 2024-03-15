
/**
 * Escreva uma descrição da classe WordGuessingGame aqui.
 * 
 * @author (Duarte Jacinto)
 * @author (Tiago Reis) 
 * @version (15-03-2024)
 */
public class WordGuessingGame
{
    private String hiddenWord;
    private String guessedWord;
    private int numberOfTries;

    public WordGuessingGame() {
        this.hiddenWord = "abc";
        this.guessedWord = "___";
        this.numberOfTries = 0;
    }

    public String getHiddenWord(){
        return hiddenWord;
    }

    public String getGuessedWord() {
        return guessedWord;
    }

    
    public int getNumberOfTries(){
        return numberOfTries;
    }

    public void showGuessedWord() {
        System.out.println(guessedWord);
    }

    
}


