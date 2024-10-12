import java.util.*;
import java.io.File;
import java.io.IOException;

public class HashMapProbs
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        //Do problems 2 Here  
        HashMap <String, String> animalSounds = new HashMap<>(); 
        animalSounds.put("Dog", "Woof"); 
        animalSounds.put("Cat", "Meow"); 
        animalSounds.put("Pig", "Oink"); 
        animalSounds.put("Bird", "Chirp"); 

        //Do problem 3 here
        System.out.print("enter a string: "); 
        String str = input.next(); 
        System.out.println(animalSounds.get(str)); 

        //Do problem 4 here
        System.out.println(animalSounds.size()); 

        //Do problem 5 here
        System.out.print("enter a new animal: "); 
        String newAnimal = input.next(); 
        System.out.print("enter a new sound: "); 
        String newSound = input.next(); 
        animalSounds.put(newAnimal, newSound); 

        //Uncomment to test Problem 7

        HashMap<String, String> w;
        w = takeBefore("apple", "fruit");
        System.out.println(w.get("a")); // <-- f
        System.out.println(w.get("p")); // <-- u
        System.out.println(w.get("p")); // <-- u
        System.out.println(w.get("i")); // <-- l
        System.out.println(w.get("e")); // <-- t

        //Uncomment to test Problem 8

        HashMap<String, Boolean> hasMult;
        String s = "robot"; 
        hasMult = multiple(s);

        for(int i=0; i<s.length(); i++)
        {
            System.out.print(s.charAt(i) + " ");
            System.out.println(hasMult.get(String.valueOf(s.charAt(i))));
        }

        //Uncomment to test Problem 9

        HashMap<String, String> firstLtr;
        firstLtr = charWord(new String[] {"tea", "sale", "soda", "taco"});
        System.out.println(firstLtr.get("s"));
        System.out.println(firstLtr.get("t"));

        //Uncomment to test Problem 10
        //wordFrequency();

    }
    //Write your methods here.
    public static HashMap<String, String> takeBefore(String a, String b)
    {
        HashMap <String, String> words = new HashMap<>(); 

        for(int i = 0; i < a.length(); i++) 
        {
            if(a.charAt(i) < b.charAt(i)) 
            {
                words.put(String.valueOf(a.charAt(i)), String.valueOf(b.charAt(i))); 
            } 
            else 
            {
                words.put(String.valueOf(b.charAt(i)), String.valueOf(a.charAt(i))); 
            }

        }

        return words;

    }

    public static HashMap<String, Boolean> multiple(String a) 
    {
        HashMap <String, Boolean> words = new HashMap<>(); 

        for(int i = 0; i < a.length(); i++) 
        {
            int count = 0;
            char letter = a.charAt(i);

            for(int j=0; j < a.length(); j++)
            {   
                if(a.charAt(j) == letter)
                {
                    count++;
                }
            }	

            if(count >= 2) 
            {
                System.out.println(count); 
                words.put(String.valueOf(a.charAt(i)), true); 
            } 
            else 
            {
                words.put(String.valueOf(a.charAt(i)), false); 
            }

        }

        return words; 

    }

    public static HashMap<String, String> charWord(String[] words)
    {
        HashMap <String, String> str = new HashMap<>(); 

        String def = ""; 

        for (int i = 0; i < words.length; i++) {
            String value = "";
            for (int j = 0; j < words.length; j++) {
                if (words[i].charAt(0) == words[j].charAt(0)) {
                    value = value+words[j];
                }
            }
            str.put(Character.toString(words[i].charAt(0)), value);
        }

        return str; 

    }

}
