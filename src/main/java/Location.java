/**
 * Created by bas on 31/05/15.
 */
public class Location {
    Label locationType;                 // O    0-1
    Label spatialLocation;              // O    0-N
    Address address;                    // O    0-N
    DateRange dateRange;                // O    0-1
    boolean isActive;                   // O    0-1
    Notes notes;                        // O    0-1
}
