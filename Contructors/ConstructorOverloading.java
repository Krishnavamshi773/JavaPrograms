package Contructors;

public class ConstructorOverloading {
ConstructorOverloading(){
	int a,b,c;
	a=5;
	b=6;
	c=a+b;
	System.out.println(c);
	     
      }
ConstructorOverloading(int l,int b){
	int ar=l*b;
	System.out.println(ar);
	
      }

	public static void main(String[] args) {
ConstructorOverloading c= new ConstructorOverloading();
ConstructorOverloading h= new ConstructorOverloading(8,7);
	}

}