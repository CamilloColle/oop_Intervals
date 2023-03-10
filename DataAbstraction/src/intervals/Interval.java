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

/**
 * Abstract state invariants:
 * 
 * @invar The lower bound is not greater than the upper bound
 * 		| getLowerBound(this) <= getUpperBound(this)
 * 
 * @invar The length equals the difference of the upper bound and the lower bound
 * 		| getLength(this) == getUpperBound(this) - getLowerBound(this)
 *
 */
public class Interval {

	public static int getLowerBound(Interval interval) {throw new RuntimeException("Not implemented");}
	public static int getUpperBound(Interval interval) {throw new RuntimeException("Not implemented");}
	
	public static int getLength(Interval interval) {throw new RuntimeException("Not implemented");}
	
	/**
	 * @post | result == (getLowerBound(interval) <= x && x < getUpperBound(interval))
	 */
	public static boolean contains(Interval interval, int x) {throw new RuntimeException("Not implemented");}
	
	//An abstract state space is composed of the possible observations you can make about an object through its inspectors
	/**
	 * @pre | lowerBound <= upperBound //here we don't use getters because before creating the object there's nothing to run getters on
	 * 
	 * @post | getLowerBound(result) == lowerBound
	 * @post | getUpperBound(result) == upperBound
	 * 
	 */
	public static Interval create(int lowerBound, int upperBound) {throw new RuntimeException("Not implemented)");}
	
	
	//primitive types can not be null so there's no need to put eg int x != null in the pre-conditions, unlike non primitive types like objects
	
	
	/**
	 * @pre | interval != null
	 * @pre | other != null
	 * 
	 * @post | getLowerBound(result) == getLowerBound(interval) + getLowerBound(other)
	 * @post | getLength(result) == getLength(interval) + getLength(other)
	 */
	public static Interval plus(Interval interval, Interval other) {throw new RuntimeException("Not implemented)");}
	
	
}
