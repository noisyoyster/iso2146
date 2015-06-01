package net.noisyoyster.iso2146;

import java.util.Date;

/**
 * Created by bdewhurs on 1/06/15.
 */
public class UpdateEvent {
    Label updateEventType;              // M    1
    Date dateRange;                     // M    1
    Label recordUpdater;                // M    1
    Label recordSource;                 // O    0-1
    Notes notes;
}
