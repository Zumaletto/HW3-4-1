public class Main {
    public static void main(String[] args) {
        FixedMilesService service = new FixedMilesService();
        int ticketPrice = 10_000;
        int fixedMiles = service.calculate(ticketPrice);
        System.out.println("Бесплатные мили за перелет :" + fixedMiles);
    }

}
