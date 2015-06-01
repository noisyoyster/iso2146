package net.noisyoyster.iso2146;

/**
 * Created by bdewhurs on 1/06/15.
 */
public class Coverage {
    Label coverageType;                 // M    1
    Label coverageArea;                 // M    1
    Description description;            // O    0-N
    Label currentStrength;              // O    0-1
    SeqLangString currentStrengthNotes; // O    0-1
    Label plannedStrength;              // O    0-1
    SeqLangString plannedStrengthNotes; // O    0-1
}
