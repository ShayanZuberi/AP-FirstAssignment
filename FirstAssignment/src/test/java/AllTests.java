import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ QueueTests.class, StackTests.class, LinkedListTests.class, ArrayTest.class })
public class AllTests {

}

