package assignment.multivariantpolynomial;
import java.util.*;
public class Term {
int coEfficient;
	
	
	List<Variable> variables;
	
	public Term (int coEfficient, List<Variable> variables) {
		this.coEfficient = coEfficient;
		this.variables = variables;
	}
}
