import java.util.HashMap;

public class DupOccurOfString {

	public static void main(String[] args) {
       String s1="my name is is dnyaneshwar my";
       String[] words=s1.split(" ");
       
       HashMap<String,Integer> hashmap=new HashMap<>();
       
       for(String w:words)
       {
    	   if (hashmap.get(w)==null) 
    	   {
    		   hashmap.put(w, 1);
    	   }
    	   else
    	   {
    		   hashmap.put(w, hashmap.get(w)+1);
    	   }
       } 
//       hashmap.forEach((k,v)->System.out.println(k+" "+v));
       hashmap.entrySet().stream().filter(entry->entry.getValue()>1).forEach(entry->System.out.println(entry.getKey()+" "+entry.getValue()));	}

}
