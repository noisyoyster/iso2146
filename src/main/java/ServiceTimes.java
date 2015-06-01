/**
 * Created by bdewhurs on 1/06/15.
 */
public class ServiceTimes {
    String serviceTimesKey;             // M    1
    Description description;            // O    0-N
    ServiceHours serviceHours;          // O    0-N
    DateRange dateRange;                // O    0-1
    Suspension suspension;              // O    0-N
}
