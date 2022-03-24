package logicalOperators;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Thread t1 = new Thread();
	        Thread t2 = new Thread();
	        Thread t3 = t1;
	 
	        String s1 = new String("GEEKS");
	        String s2 = new String("GEEKS");
	 
	        System.out.println(t1 == t2);
	        System.out.println(t1 == t3);
	        System.out.println(s1 == s2);
	 
	        System.out.println(t1.equals(t2));
	        System.out.println(s1.equals(s2));
	}
	    
}
