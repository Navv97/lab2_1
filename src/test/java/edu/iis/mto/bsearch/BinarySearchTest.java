package edu.iis.mto.bsearch;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {
    @Test
    public void testIfElementIsInSequence(){
        int[] sequence = {1};
        Assert.assertTrue(BinarySearch.search(1, sequence).isFound());
    }

    @Test
    public void testIfElementIsNotInSequence(){
        int[] sequence = {1};
        Assert.assertFalse(BinarySearch.search(2, sequence).isFound());
    }

    @Test
    public void elementFirstInSequenceTest(){
        int[] sequence = {1,2,3,4};
        Assert.assertEquals(1,BinarySearch.search(1,sequence).getPosition());
    }

    @Test
    public void elementLastInSequenceTest() {
        int[] sequence = {1,2,3,4};
        Assert.assertEquals(sequence.length, BinarySearch.search(4, sequence).getPosition());
    }

}