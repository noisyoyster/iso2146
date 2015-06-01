package net.noisyoyster.iso2146;

/**
 * Created by bas on 31/05/15.
 */
public abstract class Address {
    AddressPart addressPart;                // M    1-N
    Label testEncoding;                     // O    0-1
}
