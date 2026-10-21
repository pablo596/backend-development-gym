public class Main {
    public static void main(String[] args) {

        Passenger passenger = new Passenger("Pablo Palacios", "1309885695");

        passenger.earnMiles(500);

        passenger.redeemMiles(200);

        passenger.redeemMiles(400);

        passenger.earnMiles(-50);

        passenger.showInformation();
    }
}