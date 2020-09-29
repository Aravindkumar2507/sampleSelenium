package training;


import org.junit.Test;
import org.testng.AssertJUnit;

public class JenkinsCaseTest {

	@Test
	public void addtest() {
		JenkinsCalculator a = new JenkinsCalculator();
		System.err.println("SonarQube Checkssssssssssssss");
		AssertJUnit.assertEquals(10, a.addVals(4,6));
//		fail("Not yet implemented");
	}
	
	@Test
	public void multiplytest() {
		JenkinsCalculator a = new JenkinsCalculator();
		AssertJUnit.assertEquals(24, a.multiplyVals(4,6));
//		fail("Not yet implemented");
	}
	
	@Test
	public void checktest() {
		JenkinsCalculator a = new JenkinsCalculator();
		AssertJUnit.assertTrue("Error in Test Report", 24 == a.multiplyVals(4,6));
		AssertJUnit.assertEquals(24, a.multiplyVals(4,6));
//		fail("Not yet implemented");
	}

}
