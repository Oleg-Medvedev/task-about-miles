public class BonusMilesService {

    public int calculate(int cost) {
        int priceMile = 20;
        int amountReceivedMiles = cost / priceMile;
        return amountReceivedMiles;
    }
}
