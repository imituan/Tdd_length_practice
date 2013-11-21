package com.imituan.ThoughtWorks;

import org.hamcrest.Matcher;
import org.junit.Test;

import static com.imituan.ThoughtWorks.LengthFactory.makeLengthUnit;
import static com.imituan.ThoughtWorks.LengthFactory.plusToInch;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.Is.isA;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class LengthFactoryTest
{
    @Test
    public void should_make_mile_while_mile_length_type()
    {
        Length mile = new Mile(1);
        Length resultMile = null;
        try
        {
            resultMile = makeLengthUnit(LengthType.MILE,1);
        } catch (Exception e)
        {
            fail();
        }
        assertThat(mile.equals(resultMile),is(true));

    }

    @Test
    public void should_throw_exception_invalid_length_type()
    {
        Exception tx = null;
        try
        {
            Length invalidUnit = makeLengthUnit(LengthType.valueOf("null"), 1);
            fail();
        } catch (Exception e)
        {
            tx = e;
        }
        assertThat(tx,isA(Exception.class));
    }


    @Test
    public void should_one_mile_plus_one_yard_equal_63396_inch() throws Exception
    {
        Length resultLength = plusToInch(makeLengthUnit(LengthType.YARD, 1), makeLengthUnit(LengthType.MILE, 1));
        assertThat(makeLengthUnit(LengthType.INCH, 63396).equals(resultLength),is(true));
    }

    @Test
    public void should_one_mile_plus_one_yard_not_equal_63395_inch() throws Exception
    {
        Length resultLength = plusToInch(makeLengthUnit(LengthType.YARD, 1), makeLengthUnit(LengthType.MILE, 1));
        assertThat(makeLengthUnit(LengthType.INCH, 63395).equals(resultLength),is(false));
    }

    @Test
    public void should_one_feet_plus_one_inch_equal_13_inch() throws Exception
    {
        Length resultLength = plusToInch(makeLengthUnit(LengthType.FEET, 1), makeLengthUnit(LengthType.INCH, 1));
        assertThat(makeLengthUnit(LengthType.INCH, 13).equals(resultLength),is(true));
    }

    @Test
    public void should_one_feet_plus_one_inch_ont_equal_12_inch() throws Exception
    {
        Length resultLength = plusToInch(makeLengthUnit(LengthType.FEET, 1), makeLengthUnit(LengthType.INCH, 1));
        assertThat(makeLengthUnit(LengthType.INCH, 12).equals(resultLength),is(false));
    }

    @Test
    public void should_one_yard_plus_one_feet_equal_48_inch() throws Exception
    {
        Length resultLength = plusToInch(makeLengthUnit(LengthType.YARD, 1), makeLengthUnit(LengthType.FEET, 1));
        assertThat(makeLengthUnit(LengthType.INCH, 48).equals(resultLength),is(true));
    }

    @Test
    public void should_one_yard_plus_one_feet_not_equal_47_inch() throws Exception
    {
        Length resultLength = plusToInch(makeLengthUnit(LengthType.YARD, 1), makeLengthUnit(LengthType.FEET, 1));
        assertThat(makeLengthUnit(LengthType.INCH, 47).equals(resultLength),is(false));
    }
}
