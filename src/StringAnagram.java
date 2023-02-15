//if two string contain same character but order of the character can be differant
import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		  String str1="Race";
		  String str2="carqe";
		  
		  str1=str1.toLowerCase();
		  str2=str2.toLowerCase();
		  
		  char arr1[]=str1.toCharArray();
		  char arr2[]=str2.toCharArray();
		  
		  Arrays.sort(arr1);
		  Arrays.sort(arr2);
         
		  if(Arrays.equals(arr1,arr2))
			  System.out.println("Both string are anagram");
		  else
			  System.out.println("Both string are not anagram");
	}

}
