package com.imituan.ThoughtWorks;

import org.junit.Before;
import org.junit.Test;

import static com.imituan.ThoughtWorks.LengthFactory.makeLengthUnit;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

/**
 * User: MJ
 * Date: 13-11-16
 * Time: 下午2:29
 * Project: AnnotationTest
 */
public class LengthTest
{
    @Before
    public void setUp() throws Exception
    {


    }

    @Test
    public void should_one_mile_equal_one_mile() throws Exception
    {
        Length mile = makeLengthUnit(LengthType.MILE, 1);
        Length anotherMile = makeLengthUnit(LengthType.MILE, 1);
        assertThat(mile.equals(anotherMile),is(true));
    }

    @Test
    public void should_one_mile_not_equal_two_miles() throws Exception
    {
        Length mile = makeLengthUnit(LengthType.MILE, 1);
        Length anotherMile = makeLengthUnit(LengthType.MILE, 2);
        assertThat(mile.equals(anotherMile),is(false));
    }


    @Test
    public void should_one_mile_equal_1760_yard() throws Exception
    {
        Length mile = makeLengthUnit(LengthType.MILE, 1);
        Length yard = makeLengthUnit(LengthType.YARD, 1760);
        assertThat(mile.equals(yard),is(true));
    }

    @Test
    public void should_one_mile_not_equal_1761_yard() throws Exception
    {
        Length mile = makeLengthUnit(LengthType.MILE, 1);
        Length yard = makeLengthUnit(LengthType.YARD, 1761);
        assertThat(mile.equals(yard),is(false));
    }

    @Test
    public void should_one_yard_equal_three_feet() throws Exception
    {
        Length yard = makeLengthUnit(LengthType.YARD, 1);
        Length feet = makeLengthUnit(LengthType.FEET, 3);
        assertThat(yard.equals(feet),is(true));
    }

    @Test
    public void should_one_yard_not_equal_two_feet() throws Exception
    {
        Length feet = makeLengthUnit(LengthType.FEET, 2);
        Length yard = makeLengthUnit(LengthType.YARD, 1);
        assertThat(feet.equals(yard),is(false));
    }

    @Test
    public void should_one_feet_equal_12_inch() throws Exception
    {
        Length feet = makeLengthUnit(LengthType.FEET, 1);
        Length inch = makeLengthUnit(LengthType.INCH, 12);
        assertThat(feet.equals(inch),is(true));
    }

    @Test
    public void should_one_feet_not_equal_13inch() throws Exception
    {
        Length feet = makeLengthUnit(LengthType.FEET, 1);
        Length inch = makeLengthUnit(LengthType.INCH, 13);
        assertThat(feet.equals(inch),is(false));
    }

    @Test
    public void should_13_inch_display_one_feet_one_inch() throws Exception
    {
        Length inch = makeLengthUnit(LengthType.INCH, 13);
        String result = inch.display();
        assertThat(result, is("1 feet 1 inch"));
    }

    @Test
    public void should_2_yard_display_72_Inch() throws Exception
    {
        Length yard = makeLengthUnit(LengthType.YARD, 2);
        String result = yard.displayToInch();
        assertThat(result, is("72 inch"));
    }
}
