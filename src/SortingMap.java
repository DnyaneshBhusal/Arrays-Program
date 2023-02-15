import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortingMap {

	public static void main(String[] args) {
		HashMap<String,Integer> hashmap=new HashMap<>();
		hashmap.put("ganu", 777);
		hashmap.put("sham", 999);
		hashmap.put("mangu", 666);
		hashmap.put("dhanu", 555);
		
		
		SortedMap<String,Integer> sort=new TreeMap<String,Integer>(hashmap);
		sort.forEach((k,v)->System.out.println(k+" "+v));
		
		Set<Entry<String,Integer>> entrySet=hashmap.entrySet();
		List<Entry<String,Integer>> list=new ArrayList<>(entrySet);
		Collections.sort(list,(e2,e1)->e1.getKey().compareTo(e2.getKey()));
		//sort.forEach(System.out::println);
	}

}
