/*
 * This file is currently empty, but with a variety of TODOs to implement.
 * You may want to refer to HandBag.java to see how to structure your code.
 *
 * You may find the readings in chapter 3. Relationships between Classes
 * helpful while working through this exercise.
 */
public class CrossbodyBag extends Bag{
    /**
     * Creates a new CrossbodyBag with the given color,
     * capacity, and number of straps.
     *
     * @param color
     * @param capacity
     * @param numberOfStraps
     */
    private int numberOfStraps;

    public CrossbodyBag(String color, int capacity, int numberOfStraps) {
        super(color, capacity);
        this.numberOfStraps = numberOfStraps;
    }


    public int getNumberOfStraps(){
        return numberOfStraps;
    }


    @Override
    public void enhance() {
        super.increaseCapacity(2);
    }


    @Override
    public String toString() {
        return this.getColor() + " Crossbody Bag with " + this.getNumberOfStraps() + " straps (" +
                this.getNumberOfContents() + " / " + this.getCapacity() + ")";
    }
}
/*
 *       The enhance method should increase the capacity of the CrossbodyBag by
 *       2 (as opposed to the 1 that HandBag increases by).
 *
 *       The toString method should be overridden to return a string in the
 *       in the same form as Bag's toString but with the original "Bag" part
 *       of the string replaced by:
 *           Crossbody Bag with {numberOfStraps} straps
 *
 *       See the tests in test/CrossBodyBagTest.java for examples.
 */
