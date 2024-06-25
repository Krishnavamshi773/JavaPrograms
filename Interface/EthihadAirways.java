package Interface;

public class EthihadAirways implements Airways {

    public EthihadAirways() {
        System.out.println("Welcome to Ethihad Airways");
    }

    @Override
    public void travel() {
        System.out.println("The Flight will Travel from India to Dubai");
    }

    @Override
    public void charges() {
        System.out.println("The charges are 15k-100k ");
    }

    public static void main(String[] args) {
        EthihadAirways a = new EthihadAirways();
        Airways.type();
        a.charges();
        a.travel();

    }
}

/*interface Airways {
    void travel();
    void charges();
}*/
