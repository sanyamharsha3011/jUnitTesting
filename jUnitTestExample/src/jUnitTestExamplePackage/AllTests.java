package jUnitTestExamplePackage;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ testAddnumbers.class, testAddString.class })
public class AllTests {

}
