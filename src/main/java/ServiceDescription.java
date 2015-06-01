/**
 * Created by bdewhurs on 1/06/15.
 */
public class ServiceDescription {
    String serviceDescriptionKey;       // M    1
    Label serviceLevel;                 // O    0-1
    Obligation obligation;              // O    0-N
    Notes notes;                        // O    0-1
}
