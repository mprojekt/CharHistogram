package pl.mpietroszek;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharHistogram{
    
    public static void main(String[] args) {
                
        String example = "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. "
                + "Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque "
                + "penatibus et magnis dis parturient montes, nascetur ridiculus mus.";
        System.out.println(example);
        
        Map<Integer, Long> result = createHistogram(example); 
        printResult(result);
    }
    
    private static Map createHistogram(String string){
        return string.chars()
                .filter(i -> i > 31)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
    
    private static void printResult(Map<Integer, Long> result){
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