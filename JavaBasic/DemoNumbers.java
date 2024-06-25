package JavaBasic;

public class DemoNumbers {
 
		  public static void main(String[] args) {
		    // size of the triangle
		    int size = 5;
		    int num = 1;
		    
		    for (int i = 0; i < size; i++) {
		      // print numbers
		      for (int j = 0; j < size - i; j++) {
		        System.out.print(num++);
		      }
		      num = 1;
		      System.out.println();
		    }
		  }
		}

