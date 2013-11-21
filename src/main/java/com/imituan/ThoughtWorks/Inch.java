package com.imituan.ThoughtWorks;

/**
 * User: MJ
 * Date: 13-11-17
 * Time: 下午2:24
 * Project: AnnotationTest
 */
public class Inch extends Length
{
    public static final int RELATIVE_RATE = 1;
    public static final String UNIT_NAME = "inch";
    public Inch(int value)
    {
        super(value);
        lengthInfo.setName(UNIT_NAME);
        lengthInfo.setRelativeValue(value * RELATIVE_RATE);
        lengthInfo.setRelativeRate(RELATIVE_RATE);
    }
}
