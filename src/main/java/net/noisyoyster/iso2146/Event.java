package net.noisyoyster.iso2146;

/**
 * Created by bas on 31/05/15.
 */
public class Event {
    Label eventType;                    // M    0-1
    DateRange dateRange;                // O    0-1
    Description description;            // O    0-N
    Location location;                  // O    0-1
    Notes notes;                        // O    0-1
}
