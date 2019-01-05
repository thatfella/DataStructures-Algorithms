package test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.recursionexample.binarysearch.BinarySearchRecursive;

/**
 * Created by ESALE on 04.01.2019.
 */

public class BinarySearchRecursiveTest {
private int[] arr;
    @Before
    public void setup() {
        arr = new int[]{12, 123, 1234, 5453, 6451, 44200, 450001, 4543234};

    }
    @Test
    public void runTest() {
        Assert.assertEquals(2,BinarySearchRecursive.findRecursively(arr, 1234,0,arr.length));
    }

    @After
    public void tearDown() {
        arr = null;
    }
}
