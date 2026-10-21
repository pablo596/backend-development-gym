public class Passenger {
    private String name;
    private String identification;
    private int miles;

    public Passenger(String name, String identification) {
        this.name = name;
        this.identification = identification;
        this.miles = 0;
    }

    public void earnMiles (int amount){
        if (amount > 0){
            miles = miles+amount;
        }
    }

    public void redeemMiles (int amount){
        if (amount > 0 && amount <= miles){
            miles = miles-amount;
        }
    }

    public int getMiles() {
        return miles;
    }

    public void showInformation (){
        System.out.println("=== PASSENGER ===\n" +
                "Name: "+this.name+"\n" +
                "ID: "+this.identification+"\n" +
                "Miles balance: "+getMiles()+" miles\n" +
                "=========================");
    }
}
