package training;

public class JenkinsCalculator {
	public int addVals(int a, int b) {
		System.err.println("SonarQube ChecksQQQQQQQQQQ");
		return a+b;
	}
	public int multiplyVals(int a, int b) {
		return a*b;
	}
	public int subVals(int a, int b) {
		if(a > b){
			return a-b;
		} else {
			return b -a ;
		}	

	}
}
