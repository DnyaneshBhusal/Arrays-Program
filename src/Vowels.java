//input :- anirudha sae
//output :- eaauia
public class Vowels {
	public static void main(String[] args) {
		
	
	String str="anirudha sae";
	String rev="";
	for(int i=str.length()-1;i>=0;i--)
	{
		if(str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i' || str.charAt(i)=='o'|| str.charAt(i)=='u')
		{
			rev=rev+str.charAt(i);
		}
	}    System.out.println(rev);
  }
}
