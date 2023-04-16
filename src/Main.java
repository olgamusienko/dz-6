import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;


public class Main {
    public static void main(String[] args) {
        //
        String[] strings = new String[]{"mama", "papa", "eat mushroom oak"};
        HashSet<Character> uniqueCharacters = solution(strings);
        System.out.println(uniqueCharacters);
    }
    public static HashSet<Character> solution(String[] strings){
        int evenStringsCount = 0;
        ArrayList<String> evenStrings = new ArrayList<>();
        for(int i = 0; i < strings.length; ++i){
            char[] characters = strings[i].toCharArray();
            HashMap<Character, Integer> characterCount = new HashMap<>();

            for(char letter: characters){
                if(characterCount.containsKey(letter)){
                    int count = characterCount.get(letter);
                    characterCount.put(letter, count + 1);
                } else{
                    characterCount.put(letter, 1);
                }
            }
            boolean isEven = true;
            for(int count: characterCount.values()){
                if(count %2 != 0){
                    isEven = false;
                    break;
                }
            }
            if(isEven){
                evenStrings.add(strings[i]);
                evenStringsCount++;
            }
            if(evenStringsCount == 2){
                break;
            }
        }
        HashSet<Character> uniqueCharacters = new HashSet<>();
        for(String evenString: evenStrings){
            char[] characters = evenString.toCharArray();
            for(char letter: characters){
                uniqueCharacters.add(letter);
            }
        }
        return uniqueCharacters;
    }
}
