import java.util.HashSet;

public class CheckForAnagram {








    boolean areAnagram (String a , String b){


        HashSet<Character> set = new HashSet<>();

        for (char c : b.toCharArray()){
            set.add(c);
        }

        for (char c : a.toCharArray()){
            if (!set.contains(c)){
                return false;
            }
        }
        return true ;
    }
}
