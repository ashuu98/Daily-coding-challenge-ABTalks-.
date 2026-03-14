
import java.util.*;
public class Day12{
    public static boolean validanagram(int freq[],String s2){
        for(int i=0;i<s2.length();i++){
           char c=s2.charAt(i);
            freq[c-'a']--;
        }
        for(Integer n:freq){
            if(n!=0) return false;
        }
        return true;
    }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s1=sc.nextLine();
    String s2=sc.nextLine();

    //lower case all character
    s1=s1.toLowerCase();
    s2=s2.toLowerCase();

    int freq[]=new int[26];
    for(int i=0;i<s1.length();i++){
        char ch=s1.charAt(i);
        freq[ch-'a']++;
    }
    if(s1.length()!=s2.length()){
        System.out.println("not anagram");
        return;
    }
    if(validanagram(freq,s2))
    System.out.println(" Valid anagram");
   else
    System.out.println("not anagram");
  }
}