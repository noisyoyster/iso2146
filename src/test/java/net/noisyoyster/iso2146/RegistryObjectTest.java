package net.noisyoyster.iso2146; /**
 * Created by bas on 31/05/15.
 */

import static org.junit.Assert.assertEquals;

import net.noisyoyster.iso2146.Party;
import net.noisyoyster.iso2146.RegistryObject;
import org.junit.Test;


public class RegistryObjectTest {
    @Test
    public void shouldCreatePartyObject() {
        assertEquals(true, true);
        RegistryObject p = new Party();
        Party p2 = new Party();
        p2.identifier.equals("p");
    }
}

