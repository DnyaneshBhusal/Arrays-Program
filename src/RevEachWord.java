
public class RevEachWord {

	public static void main(String[] args) {

     String s="my name is dnyanesh";
     String[] words=s.split(" ");
     String revString="";
      for(String w:words)
      {
    	  String rev="";
    	  for(int i=w.length()-1;i>=0;i--)
    	  {
    		  rev=rev+w.charAt(i);
    	  }revString=revString+rev+" ";
      }  System.out.print(revString);
     
  }

}
