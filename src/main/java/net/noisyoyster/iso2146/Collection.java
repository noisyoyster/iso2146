package net.noisyoyster.iso2146;

/**
 * Created by bas on 31/05/15.
 */
public class Collection extends RegistryObject {
    Label collectionType;                   // O    0-N
    CollectionProfile collectionProfile;    // O    0-N
    SeqLangString rights;                   // O    0-1
}
