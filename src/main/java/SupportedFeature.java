/**
 * Created by bdewhurs on 1/06/15.
 */
public class SupportedFeature {
    Label featureType;                  // M    1
    Label featureKey;                   // M    1
    SeqLangString featureName;          // O    0-1
    String functionalLevel;             // O    0-N
    boolean isSupported;                // O    0-1
    boolean isDefault;                  // O    0-1
    String defaultSetting;              // O    0-1
    Label mapping;                      // O    0-N
    Label featureSepcificAttribute;     // O    0-N
}
