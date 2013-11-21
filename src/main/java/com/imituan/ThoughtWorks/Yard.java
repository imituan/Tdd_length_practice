package com.imituan.ThoughtWorks;

/**
 * User: MJ
 * Date: 13-11-16
 * Time: 下午3:56
 * Project: AnnotationTest
 */
public class Yard extends Length
{
    public static final int RELATIVE_RATE = 3 * 12;
    public static final String UNIT_NAME = "yard";
    public Yard(int value)
    {
        super(value);
        lengthInfo.setName(UNIT_NAME);
        lengthInfo.setRelativeValue(value * RELATIVE_RATE);
        lengthInfo.setRelativeRate(RELATIVE_RATE);
    }
}
