package net.noisyoyster.iso2146;

/**
 * Created by bdewhurs on 1/06/15.
 */
public class CollectionProfile {
    String collectionProfileKey;            // M    1
    Label measurementType;                  // O    0-1
    Label resourceType;                     // O    0-1
    int numberOfUnits;                      // O    0-1
    int averageAnnualIncrease;              // O    0-1
    int averageAnnualDecrease;              // O    0-1
    Label accrualPolicy;                    // O    0-1
    Label accrualPeriodicity;               // O    0-1
    Label accrualMethod;                    // O    0-1
    Label disposalPolicy;                   // O    0-1
    Coverage coverage;                      // O    0-N
    DateRange dateRange;                    // O    0-N
    Notes notes;                            // O    0-1
}
