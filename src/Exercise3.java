import java.util.HashSet;

//Написати метод приймає стрінгу і друкує всі її унікальні значення
// з нового рядка.
//Alexx9800
//A
//l
//e
//x
//9
//8
//0
public class Exercise3 {
    public static void main(String[] args){
        String word = new String("Alexx9800");
        uniqueCharacters(word);
    }

    public static void uniqueCharacters(String word){
        HashSet<Character> uniqueCharacters = new HashSet<>();
        for(char character : word.toCharArray()){
            uniqueCharacters.add(character);
        }

        for(char character : uniqueCharacters){
            System.out.println(character);
        }
    }
}

