/**
 * Created by bdewhurs on 1/06/15.
 */
public class AccessPolicy {
    Label function;                     // O    0-N
    Label userCategory;                 // O    0-N
    Location location;                  // O    0-N
    Label targetParty;                  // O    0-N
    Label targetCollection;             // O    0-N
    Label targetActivity;               // O    0-N
    Label targetResource;               // O    0-N
    Label resourceType;                 // O    0-N
    Label effect;                       // M    1
    String condition;                   // O    0-1
    String serviceTimesKey;             // O    0-1
    String serviceDescriptionKey;       // O    0-N
}
