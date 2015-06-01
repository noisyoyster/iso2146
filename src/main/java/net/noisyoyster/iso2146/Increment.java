package net.noisyoyster.iso2146;

/**
 * Created by bdewhurs on 1/06/15.
 */
public class Increment {
    Label measurementType;                  // M    1
    float incrementQuantity;                // M    1
    float minimumQuantity;                  // O    0-1
    float maximumQuantity;                  // O    0-1
    Label currency;                         // O    0-1
    float chargeAmount;                     // O    0-1
    float tax;                              // O    0-1
    boolean replacePreviousLevel;           // O    0-1
}
