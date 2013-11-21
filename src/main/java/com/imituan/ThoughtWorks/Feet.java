package com.imituan.ThoughtWorks;

/**
 * User: MJ
 * Date: 13-11-17
 * Time: 下午2:23
 * Project: AnnotationTest
 */
public class Feet extends Length
{
    public static final int RELATIVE_RATE = 12;
    public static final String UNIT_NAME = "feet";
    public Feet(int value)
    {
        super(value);
        lengthInfo.setName(UNIT_NAME);
        lengthInfo.setRelativeValue(value * RELATIVE_RATE);
        lengthInfo.setRelativeRate(RELATIVE_RATE);
    }
}
