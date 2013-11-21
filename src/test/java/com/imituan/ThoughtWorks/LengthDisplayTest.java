package com.imituan.ThoughtWorks;

import org.junit.Before;
import org.junit.Test;

import static com.imituan.ThoughtWorks.LengthFactory.makeLengthUnit;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LengthDisplayTest
{
    private LengthDisplay lengthDisplay = null;
    @Before
    public void setUp() throws Exception
    {
        lengthDisplay = new LengthDisplay();
    }

    @Test
    public void should_13_inch_display_one_feet_one_inch() throws Exception
    {
        Length inch = makeLengthUnit(LengthType.INCH, 13);
        String result = lengthDisplay.displayLength(inch);
        assertThat(result, is("1 feet 1 inch"));
    }

    @Test
    public void should_37_inch_display_one_yard_one_inch() throws Exception
    {
        Length inch = makeLengthUnit(LengthType.INCH, 37);
        String result = lengthDisplay.displayLength(inch);
        assertThat(result, is("1 yard 1 inch"));
    }

    @Test
    public void should_49_inch_display_one_yard_one_feet_one_inch() throws Exception
    {
        Length inch = makeLengthUnit(LengthType.INCH, 49);
        String result = lengthDisplay.displayLength(inch);
        assertThat(result, is("1 yard 1 feet 1 inch"));
    }

    @Test
    public void should_63409_inch_display_one_mile_one_yard_one_feet_one_inch() throws Exception
    {
        Length inch = makeLengthUnit(LengthType.INCH, 63409);
        String result = lengthDisplay.displayLength(inch);
        assertThat(result, is("1 mile 1 yard 1 feet 1 inch"));
    }

    @Test
    public void should_zero_inch_display_zero_inch() throws Exception
    {
        Length inch = makeLengthUnit(LengthType.INCH, 0);
        String result = lengthDisplay.displayLength(inch);
        assertThat(result, is("0 inch"));
    }

    @Test
    public void should_1761_yard_display_one_mile_one_yard() throws Exception
    {
        Length yard = makeLengthUnit(LengthType.YARD, 1761);
        String result = lengthDisplay.displayLength(yard);
        assertThat(result, is("1 mile 1 yard"));
    }

    @Test
    public void should_3_yard_display_3_yard() throws Exception
    {
        Length yard = makeLengthUnit(LengthType.YARD, 3);
        String result = lengthDisplay.displayLength(yard);
        assertThat(result, is("3 yard"));
    }

    @Test
    public void should_5282_feet_display_1_mile_2_feet() throws Exception
    {
        Length feet = makeLengthUnit(LengthType.FEET, 5282);
        String result = lengthDisplay.displayLength(feet);
        assertThat(result, is("1 mile 2 feet"));
    }

    @Test
    public void should_5283_feet_display_1_mile_1_yard() throws Exception
    {
        Length feet = makeLengthUnit(LengthType.FEET, 5283);
        String result = lengthDisplay.displayLength(feet);
        assertThat(result, is("1 mile 1 yard"));
    }

    @Test
    public void should_2_yard_display_72_inch() throws Exception
    {
        Length yard = makeLengthUnit(LengthType.YARD, 2);
        String result = lengthDisplay.displayLengthToInch(yard);
        assertThat(result, is("72 inch"));
    }

    @Test
    public void should_3_feet_display_36_inch() throws Exception
    {
        Length feet = makeLengthUnit(LengthType.FEET, 3);
        String result = lengthDisplay.displayLengthToInch(feet);
        assertThat(result, is("36 inch"));
    }
}
