import java.util.Date;

/**
 * Created by bas on 31/05/15.
 */
public abstract class RegistryObject {
    Label registryObjectKey;            // M    1
    Identifier identifier;              // O    0-N
    Name name;                          // O    0-N
    Relation relation;                  // O    0-N
    Location location;                  // O    0-N
    Label subject;                      // O    0-N
    Description description;            // O    0-N
    InfoPointer infoPointer;            // O    0-N
    Event event;                        // O    0-N
    DateRange dateRange;                // O    0-1
    boolean isActive;                   // O    0-1
    Label language;                     // O    0-N
    Notes notes;                        // O    0-1
    Date dateRecordCreated;             // M    1
    Date dateRecordLastModified;        // M    1
    RecordDetails recordDetails;        // O    0-1
}
