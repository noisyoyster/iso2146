package net.noisyoyster.iso2146;

/**
 * Created by bdewhurs on 1/06/15.
 */
public class Product {
    String productKey;                  // M    1
    Label productType;                  // O    0-1
    Label function;                     // O    0-1
    Description description;            // O    0-1
    Label inputDescription;             // O    0-N
    Label outputDescription;            // O    0-N
    Notes notes;                        // O    0-1

}
