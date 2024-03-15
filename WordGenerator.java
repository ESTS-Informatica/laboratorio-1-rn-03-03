
/**
 * Escreva uma descrição da classe WordGenerator aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */

import java.util.ArrayList;
import java.util.Random;

public class WordGenerator
{
   private ArrayList<String> words;


public WordGenerator(){
    words = new ArrayList<>();
}

private void  fillArrayList(){
    words.add("boolean");
    words.add("break");
    words.add("byte");
    words.add("case");
    words.add("char");
    words.add("class");
    words.add("continue");
    words.add("do");
    words.add("double");
    words.add("else");
    words.add("enum");
    words.add("for");
    words.add("if");
    words.add("import");
    words.add("int");

}

public String generateWord(){
    fillArrayList();
    String word;
    int random = new Random().nextInt(words.size());
    word = this.words.get(random);
    return word;
}

public void addWord(String word){
    words.add(word);
}
}


