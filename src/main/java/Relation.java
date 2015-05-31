/**
 * Created by bas on 31/05/15.
 */
public class Relation {
    Label relationType;                 // M    1
    Label relatedRegistryObjectKey;     // M    1
    Label relationQuantifier;           // O    0-N
    DateRange dateRange;                // O    0-1
    boolean isActive;                   // O    0-1
    Notes notes;                        // O    0-1
}
