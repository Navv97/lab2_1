package edu.iis.mto.bsearch;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class BinarySearchTest {
    @Test
    public void testIfElementIsInSequence(){
        int[] sequence = {1};
        Assert.assertThat(true, is(equalTo(BinarySearch.search(1, sequence).isFound())));    }

    @Test
    public void testIfElementIsNotInSequence(){
        int[] sequence = {1};
        Assert.assertThat(false,is(equalTo((BinarySearch.search(2, sequence).isFound()))));
    }

    @Test
    public void elementFirstInSequenceTest(){
        int[] sequence = {1,2,3,4};
        Assert.assertThat(1, is(equalTo(sequence[BinarySearch.search(1, sequence).getPosition()])));
    }

    @Test
    public void elementLastInSequenceTest() {
        int[] sequence = {1,2,3,4};
        Assert.assertThat(4, is(equalTo(sequence[BinarySearch.search(4, sequence).getPosition()])));
    }

    @Test
    public void elementMiddleInSequenceTest() {
        int[] sequence = {1,2,3,4,5};
        Assert.assertThat(3, is(equalTo(sequence[BinarySearch.search(3, sequence).getPosition()])));    }

    @Test
    public void testIfElementIsNotInMultipleElementSequence(){
        int[] sequence = {1,2,3,4,5};
        Assert.assertThat(-1, is(equalTo(BinarySearch.search(6, sequence).getPosition())));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIfSequenceIsEmpty(){
        int[] sequence = {};
        BinarySearch.search(1, sequence);
    }

}