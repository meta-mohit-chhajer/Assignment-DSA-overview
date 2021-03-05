package assignment.multivariantpolynomial;

import java.util.*;

public class MultivariantPolynomial {
	public List<Term> polynomial = new ArrayList<>();

	/**
	 * Constructor accepting an array of values
	 * 
	 * @param array Input
	 *            
	 */
	public MultivariantPolynomial(int array[]) {

		for (int loop = 0; loop < array.length; loop = loop + 3) {

			Variable var1 = new Variable('x', array[loop + 1]);

			Variable var2 = new Variable('y', array[loop + 2]);

			List<Variable> variable = new ArrayList<Variable>();

			variable.add(var1);
			variable.add(var2);

			Term term = new Term(array[loop], variable);

			polynomial.add(term);

		}
	}

	/**
	 * Used to print the polynomial expression
	 */
	public void showPolynomial() {

		for (int loopCounter = 0; loopCounter < this.polynomial.size(); loopCounter++) {

			Term term = this.polynomial.get(loopCounter);

			if (loopCounter == 0) {
				if (term.coEfficient > 0) {
					System.out.print(term.coEfficient);
				} else {
					System.out.print(term.coEfficient);
				}
			} else {
				if (term.coEfficient > 0) {
					System.out.print(" + " + term.coEfficient);
				} else {
					System.out.print(" - " + (-1 * term.coEfficient));
				}
			}

			for (Variable var : term.variables) {
				if (var.variable == 'x')
					System.out.print("x^" + var.power);
				if (var.variable == 'y')
					System.out.print("y^" + var.power);
			}
		}
	}

	/**
	 * Used to get the highest degree of polynomial expression
	 * 
	 * @return the highest degree of type Integer
	 */
	public int findDegree() {
		int degree = 0;
		for (Variable var : this.polynomial.get(0).variables)
			degree += var.power;
		for (Term term : this.polynomial) {
			int sum = 0;
			for (Variable var : term.variables) {
				sum += var.power;
			}
			if (sum > degree) {
				degree = sum;
			}
		}
		return degree;
	}

}
