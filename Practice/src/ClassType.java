
public class ClassType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*int a= 20;
long l =a;
System.out.println(l);

double d =100.04 ;
int c= (int)d ;
System.out.println(c);*/
		
		
String str1= "HellomynameisSibaMynameisRoy";
String str2= "Hello";
String str3 = "My name is";
//String[] arr = str1.split("\\s");
String[] arr = str1.split("i", 1);


String b = "";


for(String value:arr)
	System.out.println(value);
/*
	System.out.println(arr[0]);
System.out.println(arr[1]);
System.out.println(arr[2]);*/
//System.out.println(arr);


//System.out.println(str1.replaceFirst("Hello", "Bye"));
//System.out.println(str1.replace("is", "was"));

/*System.out.println(str1.replace('H', 'h'));

boolean str3= str1.equals(str2);
System.out.println(str3);

System.out.println(str1.lastIndexOf('l',3));

*/

/*char a= str1.charAt(4);
char b=str1.charAt(1);
System.out.println(a);
System.out.println(b);
int c = a+b;
System.out.println(c);

int length =str1.length();
System.out.println(length);*/


int arr1[]= {1,2,3,4,5,6};


		
		
		
	}

}
