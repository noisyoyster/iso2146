/**
 * Created by bdewhurs on 1/06/15.
 */
public class Obligation {
    Label chargeType;                   // M    1
    Label function;                     // O    0-1
    RequestMethod requestMethod;        // CO   0-1
    RequestMethod deliveryMethod;       // CO   0-1
    RequestMethod billingMethod;        // CO   0-1
    RequestMethod paymentMethod;        // CO   0-1
    String productKey;                  // O    0-1
    boolean isSupported;                // O    0-1
    Description description;            // O    0-N
    Label obligationAttribute;          // O    0-N
    Charge charge;                      // O    0-1
}
