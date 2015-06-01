/**
 * Created by bdewhurs on 1/06/15.
 */
public class Charge {
    Label currency;                         // M    1
    float chargeAmount;                     // M    1
    boolean taxIncluded;                    // O    0-1
    float tax;                              // O    0-1
    Increment increment;                    // O    0-1
    Notes notes;                            // O    0-1
}
