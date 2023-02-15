import java.util.HashMap;

public class CountCharFromString {
	public static void main(String[] args) {
		
	String str="big black dog bit a big black cat";
	str=str.replace(" ", "");
	HashMap<Character,Integer> map=new 	HashMap<Character,Integer>();
	
	for(int i=0;i<str.length();i++)
	{
		if(map.containsKey(str.charAt(i)))
				{
			     map.put(str.charAt(i), map.get(str.charAt(i))+1);
				}
		else {
			map.put(str.charAt(i), 1);
		}
	}System.out.println(map);
	
}

}
