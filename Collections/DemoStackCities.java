package Collections;
//importing stack package
import java.util.Stack;
//class name as city
class City {
	//variable declration
    String name;
    double literacyRate;

    //using methods
    public City(String name, double literacyRate) {
        this.name = name;
        this.literacyRate = literacyRate;
    }
}

public class DemoStackCities {

	//main method
	public static void main(String[] args) {
    	//creating stack object
        Stack<City> Stack = new Stack<>();

        // Push cities into the stack
        Stack.push(new City("HYDERABAD", 95.5));
        Stack.push(new City("WARANGAL", 88.3));
        Stack.push(new City("NIZAMABAD", 91.1));

        // Retrieve the top city
        City topCity = Stack.peek();
        System.out.println("Top City: " + topCity.name);

        // Search for a city in the list
        String searchCity = "NIZAMABAD";
        for (City city : Stack) {
            if (city.name.equals(searchCity)) {
                System.out.println(searchCity + " found with literacy rate: " + city.literacyRate);
                break;
            }
        }
    }
}