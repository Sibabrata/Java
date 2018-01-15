
public class ClassB extends ClassA {

 void Boy(){
		int a =5;
		int b=10;
		int c= a+b;
		System.out.println(c);
		
	}//end of method
 
 int Boy(int a){
	 
	 System.out.println(10);
	 
	 return a;
	 
	 
 }//end of method
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ClassA  f= new ClassA();
		
		ClassB g=new ClassB();
		g.Boy(5);
		
		
        
	}

}
