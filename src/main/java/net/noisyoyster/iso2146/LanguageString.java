package net.noisyoyster.iso2146;

/**
 * Created by bas on 31/05/15.
 */
public class LanguageString {
    String languageStringValue;         // M    1
    Label language;                     // O    0-1
    Label languageStringType;           // O    0-1
    Label languageStringTypeSystem;     // O    0-1
    boolean isDefault;                  // O    0-1

}
