package Inheritance;
//sub child class Fourwheeler to inherit the properties of child class Roadtransport and parent class Transport
public class FourWheeler extends RoadTransport {
	
	//sub child class method
	void FourWheeler() {
		
		//print output stream to display the output on console
		System.out.println("The Road transport is done by Four wheelers");
		}

	//Main method
	public static void main(String[] args) {
		
		//Object creation of Sub  child class Fourwheeler
FourWheeler f=new FourWheeler(); 

f.FourWheeler();//Initialisation of Sub child class
f.Roadtransport();//Initialisation of child class
f.Transport();//Initialisation of parent class
	}

}
