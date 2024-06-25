package Collections;
	import java.util.LinkedList;
	import java.util.List;
public class DemoLinkedList{
		public static void main(String[] args) {
			List<Double> list=new LinkedList<Double>();
			list.add(2000.02);
			list.add(2502.07);
			list.add(3600.08);
			list.add(2015.02);
			list.add(450.44);
			System.out.println(list);
			System.out.println(list.size());
			list.remove(0);
			System.out.println(list);
			System.out.println(list);
				}

	
}
