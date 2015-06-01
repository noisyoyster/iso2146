package net.noisyoyster.iso2146;

/**
 * Created by bas on 31/05/15.
 */
public class Service extends RegistryObject {
    Label serviceType;                      // O    0-N
    Label function;                         // O    0-N
    Product product;                        // O    0-N
    ServiceTimes serviceTimes;              // O    0-N
    Label policyCombiningAlgorithm;         // O    0-1
    AccessPolicy accessPolicy;              // O    0-N
    ServiceDescription serviceDescription;  // O    0-N
    ProtocolInformation protocolInformation;// O    0-N
}
