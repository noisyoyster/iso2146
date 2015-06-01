package net.noisyoyster.iso2146;

import java.util.Date;

/**
 * Created by bdewhurs on 1/06/15.
 */
public class ServiceHours {
    int dayOfWeek;                      // M    1
    Date timeValidFrom;                 // O    1 TODO Fix -> this is not a date but a time of day eg 09:00
    Date timeValidTo;                   // O    1 TODO Fix -> this is not a date but a time of day eg 09:00
}
