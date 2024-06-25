package Interface;

@FunctionalInterface
public interface Airways {

	void travel();

	default void charges() {
		System.out.println("The charges are");
	}
	static void type() {
		
		System.out.println("The Type of the Airways are");

	}
}
