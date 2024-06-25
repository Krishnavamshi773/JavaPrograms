package Strings;

public class StringObject {

		public static void main(String[] args) {
			
			//string declaration using literal
			String name = "Anudip";
			
			System.out.println(name);
			
			//using constructor
			String Course = new String ("APJFSA Course");
			
			System.out.println(Course);
			
			char[] courseType = {'a','w','s'};
			
			//using char array
			String course1 = new String(courseType);
			
			System.out.println(course1);
			
			System.out.println(name.concat("Foundation"));

			
			name = "Anudip Foundation";
			
			System.out.println(name);
			
			System.out.println(name.charAt(15));
			
			System.out.println(name.indexOf('n'));
			
			System.out.println(name.lastIndexOf('n'));

			System.out.println(name.indexOf('n',2));

			
			System.out.println(name.length());
			
			System.out.println(name.contains(Course));
			
			System.out.println(name.indexOf('c'));
			
			System.out.println(name.equals(course1));

			String name1 = "Anudip Foundation";
			
			System.out.println(name.compareTo(course1));
			
			System.out.println(name.compareTo(name1));

			System.out.println(name.compareToIgnoreCase(name1));

			System.out.println(name.equalsIgnoreCase(name1));

		}

	}
