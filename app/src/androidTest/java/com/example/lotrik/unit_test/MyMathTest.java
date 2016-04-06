package com.example.lotrik.unit_test;

import android.test.AndroidTestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by lotrik on 03.02.16.
 */

public class MyMathTest extends AndroidTestCase{

    MyMath myMath;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testAdd() throws Exception {

        myMath = new MyMath();

        assertEquals(10, myMath.add(5,5));

        mContext.getApplicationContext();

    }

}