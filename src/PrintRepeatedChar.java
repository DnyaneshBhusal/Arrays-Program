
public class PrintRepeatedChar {

	public static void main(String[] args) {
		 String str="Dnyanesh";
	        int arr[]=new int[str.length()];
	        for(int i=0;i<str.length();i++)
	        {
	            arr[str.charAt(i)]++;
	        }
	        for(int j=0;j<str.length();j++)
	        {if(arr[j]>=1)
	        {
	            System.out.println(arr[j]);
	        }
       
	

}

	}
}
