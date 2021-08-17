public class FixedMilesService {
    public int calculate(int ticketPrice) {
        int numberRubles = 20;
        int fixedMiles = ticketPrice / numberRubles;
        return fixedMiles;
    }

}
