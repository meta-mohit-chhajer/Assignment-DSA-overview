package assignment.multivariantpolynomial;
import static org.junit.Assert.*;
import org.junit.Test;
public class MulitvariantPolynomialTest {

	@Test
	public void testDegreeofMultivariantPolynomial(){
		MultivariantPolynomial poly=new MultivariantPolynomial(new int[]{1,2,1,-6,3,12,3,12,12});
		assertEquals(24,poly.findDegree());
	}
	
	
}
