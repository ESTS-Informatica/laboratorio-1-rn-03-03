
/**
 * Classe principal do jogo.
 * Contém o funcionamento do jogo.
 * 
 * @author (Duarte Jacinto)
 * @author (Tiago Reis) 
 * @version (15-03-2024)
 */

import java.util.Arrays;

public class WordGuessingGame
{
    private String hiddenWord;
    private String guessedWord;
    private int numberOfTries;
    private InputReader reader;
    private WordGenerator wordGenerator;

    //public WordGuessingGame(String hiddenWord) { <- Antes do nivel 4
    public WordGuessingGame() {
        //this.hiddenWord = hiddenWord; <- Antes do nivel 4
        wordGenerator = new WordGenerator();
        this.hiddenWord = wordGenerator.generateWord();
        this.guessedWord = "";
        this.numberOfTries = 0;
        this.reader = new InputReader();
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

    private void showGuessedWord() {
        System.out.println(guessedWord);
    }

    public void play(){
        System.out.print('\u000C');
        showWelcome();
        
        for(int i = 0; i < hiddenWord.length(); i++) {
            this.guessedWord += "_";
        }
            while(!guessedWord.equalsIgnoreCase(hiddenWord)){
                System.out.println("");
                System.out.println(guessedWord);
                char letter = reader.getChar("Escolha uma letra: ");
                guess(letter);
                System.out.println();
                numberOfTries += 1; 
            }  
        showResult(); 
    }

    private void showWelcome(){
        System.out.println(".----------------------------.");
        System.out.println("| Bem vindo ao jogo da forca |");
        System.out.println("'----------------------------'");
        System.out.println("");
    }
    
    private void guess(char letter){
        char[] hiddenArray = hiddenWord.toCharArray();
        char[] guessedArray = guessedWord.toCharArray();

        for(int i = 0; i < hiddenArray.length; i++){
            if(hiddenArray[i] == letter){
                guessedArray[i] = hiddenArray[i];
            }
        }
        guessedWord = new String(guessedArray);

        if(hiddenWord.indexOf(letter) == -1) {
            System.out.println("A letra " + letter + " não pertence à palavra.");
        }
    }

    public void showResult() {
        System.out.println("Adivinhado!");
        System.out.println("A palavra era: " + hiddenWord);
        System.out.println("Tentativas: " + numberOfTries);
    }

    public void reset() {
        this.hiddenWord = wordGenerator.generateWord();
        this.guessedWord = "";
        this.numberOfTries = 0;
    }
}


