import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class RevSentense {

	public static void main(String[] args) {
	    String str="my name is dnyaneshwar is";   //ym eman si rawhsenaynd si
	    String s[]=str.split(" ");
	    
//	    StringBuffer sb=new StringBuffer();
//	 
//	  
//		  for(int i=s.length-1;i>=0;i--)
//		  {
//			  sb.append(s[i]);
//			  sb.append(" ");
//		  }System.out.println(sb);
	    String words="";
	    for(int i=s.length-1;i>=0;i--) {
	    	words=words+s[i]+" ";
	    }System.out.println(words);
	  }
	}
	









	

