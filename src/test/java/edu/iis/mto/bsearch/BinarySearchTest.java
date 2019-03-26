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


}