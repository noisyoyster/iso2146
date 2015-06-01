package net.noisyoyster.iso2146;

import java.util.Date;

/**
 * Created by bdewhurs on 1/06/15.
 */
public class Status {
    Label statusType;                   // M    1
    Label statusValue;                  // M    1
    Date dateStatusAssigned;            // O    0-1
    Notes notes;                        // O    0-1
}
