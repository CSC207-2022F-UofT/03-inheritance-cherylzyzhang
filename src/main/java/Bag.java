/*
 * This file defines an abstract class named Bag.
 * In this exercise, you will be writing a larger class according to
 * the TODOs we have left you. You may find the readings in chapter
 * 1. Introduction to Java helpful.
 */

import java.sql.Struct;

public abstract class Bag {
    private String color;
    private int numberOfContents;
    private int capacity;
    private String[] contents;


    public Bag(String color, int capacity){
        this.color = color;
        this.capacity = capacity;
        this.numberOfContents = 0;
        this.contents = new String[] {};
    }


    public String getColor(){
        return this.color;
    }


    public int getCapacity(){
        return this.capacity;
    }


    public int getNumberOfContents(){
        return this.numberOfContents;
    }


    public void setColor(String color){
        this.color = color;
    }


    public boolean addItem(String item){
        if (numberOfContents < capacity){
            String[] new_contents = new String[numberOfContents + 1];
            System.arraycopy(contents, 0, new_contents, 0, numberOfContents);
            new_contents[numberOfContents] = item;
            contents = new_contents;
            numberOfContents ++;
            return true;
        }
        else {return false;}
    }





    /**
     * If there are no items in this Bag, return null.
     *
     * @return
     */
    public String popItem(){
        if (numberOfContents != 0){
            String last_item = new String(contents[numberOfContents - 1]);
            String[] new_contents = new String[numberOfContents - 1];
            System.arraycopy(contents, 0, new_contents, 0, numberOfContents - 1);
            contents = new_contents;
            numberOfContents --;
            return last_item;
        }
        else {return null;}
    }


    /**
     * Increase this bag's capacity by n.
     *
     * @param n the amount to increase this Bag's capacity by
     */
    public void increaseCapacity(int n) {
        capacity += n;
    }


    /**
     * Return the details of this Bag.
     * This method requires you to have created the private
     * instance variables mentioned above.
     *
     * @return
     */
    @Override
    public String toString() {
        return this.color + " Bag (" + this.numberOfContents + " / " +
                this.capacity + ")";
    }

    /*
     * Below we have defined an abstract method.
     * This method takes no arguments and does not return anything.
     * It increases the capacity of this Bag.
     *
     * You will need to implement this method in
     * HandBag.java and CrossbodyBag.java.
     *
     * We recommend you look at HandBag.java first.
     */
    public abstract void enhance();
}