package intervals;

/*
 * Procedure for defining a data abstraction:
 * 
 * 1. Define the raw abstract state space
 * 		= declare the inspectors
 * 
 * 2. Define the valid abstract state space (= space of valid abstract states)
 * 		= write the abstract state invariants
 * 
 * 3. Declare and document the factory methods (methods that create an object) and the mutator methods
 */

/*
 * Procedure for implementing a data abstraction
 * 
 * 1. Define the raw concrete state space =
 * 		define the fields
 * 
 * 2. 
 * 
 * 3. 
 * 
 * 4. Implement the factory methods and the mutator methods
 */

/**
 * Abstract state invariants:
 * 
 * @invar The lower bound is not greater than the upper bound
 * 		| getLowerBound() <= getUpperBound()
 * 
 * @invar The length equals the difference of the upper bound and the lower bound
 * 		| getLength() == getUpperBound() - getLowerBound()
 * 
 * If there is now ambiguity we can get rid of the 'this.'
 *
 */
public class Interval {
	
	/**
	 * Representation invariants:
	 * 
	 * @invar | lowerBound <= upperBound
	 */
	
	private int lowerBound;
	private int upperBound;
	
	
	//an instance method has no static keyword
	public int getLowerBound() { return this.lowerBound; }
	public int getUpperBound() { return this.upperBound; }
	
	public int getLength() { return this.upperBound - this.lowerBound; }
	
	/**
	 * @post | result == (this.getLowerBound() <= x && x < this.getUpperBound())
	 */
	public  boolean contains(int x) { return this.getLowerBound() <= x && x < this.getUpperBound(); }
	
	//You should always define a constructor because when none is defined Java will initialize all the fields of an obj to 0 which sometimes is not tolerated
	//An abstract state space is composed of the possible observations you can make about an object through its inspectors
	/**
	 * @pre | lowerBound <= upperBound //here we don't use getters because before creating the object there's nothing to run getters on
	 * 
	 * @post | this.getLowerBound() == lowerBound
	 * @post | this.getUpperBound() == upperBound
	 * 
	 */
	public Interval (int lowerBound, int upperBound) {
		this.lowerBound = lowerBound;
		this.upperBound = upperBound;
	}
	
	
	//primitive types can not be null so there's no need to put eg int x != null in the pre-conditions, unlike non primitive types like objects
	
	
	/**
	 * 
	 * @pre | other != null
	 * 
	 * @post | result.getLowerBound() == this.getLowerBound() + other.getLowerBound()
	 * @post | result.getLength() == this.getLength() + other.getLength()
	 */
	public  Interval plus(Interval other) {
		return new Interval(
				this.lowerBound + other.lowerBound,
				this.upperBound + other.lowerBound);
	}
	
	
}
