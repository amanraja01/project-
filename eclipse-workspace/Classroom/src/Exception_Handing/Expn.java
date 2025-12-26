package Exception_Handing;

public class Expn {

	public static void main(String[] args) {
		
	 int a = 10, b = 0;
	 System.out.println("Hello"); //Source
	 try {
	 int c = a/b;
	 System.out.println(c);
	 }catch(Exception e){
		 System.out.println(e);
     }
	 
	 System.out.println("Java");
	}
}
