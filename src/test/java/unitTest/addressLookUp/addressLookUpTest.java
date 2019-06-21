package unitTest.addressLookUp;

import org.jsmart.zerocode.core.domain.JsonTestCase;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@TargetEnv("local_host.properties")
@RunWith(ZeroCodeUnitRunner.class)
public class addressLookUpTest {

    @Test
    @JsonTestCase("unitTest/addressLookUp/hopewiser.json")
    public void testHopewiser() throws  Exception{

    }
}
