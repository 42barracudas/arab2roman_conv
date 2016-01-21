package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Vitaliy on 1/15/2016.
 */
public class MainTest {

    ArrabicToRomanConverter converter;

    @org.junit.Before
    public void setUp() throws Exception {
        converter = new ArrabicToRomanConverter();
    }

    @Test
    public void test_1_to_I() {
        assertEquals("I", converter.convert(1));
    }

    @Test
    public void test_2_to_II() {
        assertEquals("II", converter.convert(2));
    }

    @Test
    public void test_3_to_III() {
        assertEquals("III", converter.convert(3));
    }

    @Test
    public void test_4_to_IV() {
        assertEquals("IV", converter.convert(4));
    }

    @Test
    public void test_5_to_V() {
        assertEquals("V", converter.convert(5));

    }

    @Test
    public void test_6_to_VI() {
        assertEquals("VI", converter.convert(6));
    }

    @Test
    public void test_7_to_VII() {
        assertEquals("VII", converter.convert(7));
    }

    @Test
    public void test_8_to_VIII() {
        assertEquals("VIII", converter.convert(8));
    }

    @Test
    public void test_9_to_IX() {
        assertEquals("IX", converter.convert(9));
    }

    @Test
    public void test_10_to_X() {
        assertEquals("X", converter.convert(10));
    }

    @Test
    public void test_11_to_XI() {
        assertEquals("XI", converter.convert(11));
    }


    @Test
    public void test_14_to_XIV() {
        assertEquals("XIV", converter.convert(14));
    }


    @Test
    public void test_21_to_XXI() {
        assertEquals("XXI", converter.convert(21));
    }


    @Test
    public void test_24_to_XXIV() {
        assertEquals("XXIV", converter.convert(24));
    }


    @Test
    public void test_29_to_XXIX() {
        assertEquals("XXIX", converter.convert(29));
    }

    @Test
    public void test_1059_to_MLIX() {
        assertEquals("MLIX", converter.convert(1059));
    }



}