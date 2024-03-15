
/**
 * Escreva uma descrição da classe WordGuessingGame aqui.
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

    public WordGuessingGame(String hiddenWord) {
        this.hiddenWord = hiddenWord;
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
                if(guess()){
                    System.out.println(guessedWord);
                    numberOfTries += 1;
                } else {
                    System.out.println("A letra que digitou está errada");
                    numberOfTries += 1;
                }   
            }  
        showResult(); 
    }

    private void showWelcome(){
        System.out.println(".----------------------------.");
        System.out.println("| Bem vindo ao jogo da forca |");
        System.out.println("'----------------------------'");
        System.out.println("");
    }

    private boolean guess() {
        char letter = reader.getChar("Escolha uma letra: ");
        if (hiddenWord.indexOf(letter) != -1){
            int index = hiddenWord.indexOf(letter);
            guessedWord = guessedWord.substring(0, index)
            + letter + guessedWord.substring(index + 1);
            return true;
        }
        return false;
    }

    public void showResult() {
        System.out.println("Adivinhado!");
        System.out.println("A palavra era: " + hiddenWord);
        System.out.println("Tentativas: " + numberOfTries);
    }
}


