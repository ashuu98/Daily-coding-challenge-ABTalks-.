
import java.util.*;
public class Day15{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        String str=sc.next();

        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }

        for(Character key: map.keySet()){
            if(map.get(key)>1){
                System.out.print(key+" ");
            }
        }
    }
}

// tc:-it takes O(n) time complexcity (n for storing all character in a hashmap with freq 
// and O(n) for iterating unique character)
// sc:- O(n)