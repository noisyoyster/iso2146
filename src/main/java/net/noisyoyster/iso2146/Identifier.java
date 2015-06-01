package net.noisyoyster.iso2146;

/**
 * Created by bas on 31/05/15.
 */
public class Identifier {
    Label identifierValue;              // M    1
    Label identifierRole;               // O    O-N
    boolean isDefault;                  // O    O-1
    DateRange dateRange;                // O    O-1
    boolean isActive;                   // O    O-1
    Notes notes;                        // O    O-1
}
