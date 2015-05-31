/**
 * Created by bas on 31/05/15.
 */

import static org.junit.Assert.assertEquals;

import junit.framework.Assert;
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

