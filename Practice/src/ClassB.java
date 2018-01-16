
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
	
 void add(){
	 
 }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ClassB obj = new ClassB();
		ClassA obj2 = new ClassA();
		obj2.c=1;
		System.out.println(obj2.c);
		ClassA obj4 = new ClassB();
		ClassB obj5 = (ClassB)obj4;
		obj5.add();
		
		
        
	}

}
