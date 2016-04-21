package pl.mpietroszek;

import java.util.*;

public class CharHistogram{
    
    public static void main(String[] args) {
        
        Map<Integer, Integer> result = new HashMap<>();        
        String inputString = "Ala ma \"kota\"\n Aa-Zz ąęvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv";
                
        inputString.chars()
                .filter(i -> i > 31)
                .forEach(i -> {
                    int number = 1;
                    if(result.containsKey(i)){
                        number = result.get(i);
                        number++;
                    }
                    result.put(i, number);
                });
        
        System.out.println(inputString);
        printResult(result);
    }
    
    private static void printResult(Map<Integer, Integer> result){
        StringBuilder numbers = new StringBuilder();
        StringBuilder line = new StringBuilder();
        StringBuilder characters = new StringBuilder();
        
        result.forEach((key, value) -> {
            for(int i = 1; i < value.toString().length(); i++){
                line.append("-");
                characters.append(" ");
            }
            numbers.append(" ").append(value).append(" |");
            line.append("---|");
            characters.append(" ").append((char)key.intValue()).append(" |");
        });
        
        System.out.println("\n" + numbers.substring(0, numbers.length() - 2) + 
                "\n" + line.substring(0, line.length() - 1) + 
                "\n" + characters.substring(0, characters.length() - 2));
    }
}