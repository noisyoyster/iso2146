package net.noisyoyster.iso2146;

/**
 * Created by bdewhurs on 1/06/15.
 */
public class ProtocolInformation {
    Label protocol;                     // M    1
    String versionNumber;               // O    0-N
    Software software;                  // O    0-1
    Label supportedProfile;             // O    0-N
    SupportedFeature supportedFeature;  // O    0-N
    SupportedCharacterSet supportedCharacterSet;    // O    0-N
}
