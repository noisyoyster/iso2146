package net.noisyoyster.iso2146;

/**
 * Created by bas on 31/05/15.
 */
public class Name {
    Label nameRole;                     // M    1
    String unstructuredName;            // CM   1       TODO
    NamePart namePart;                  // CM   1-N     TODO
    DateRange dateRange;                // O    O-1
    boolean isActive;                   // O    O-1
    Notes notes;                        // O    O-1
}
