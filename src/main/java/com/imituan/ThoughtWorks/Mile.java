package com.imituan.ThoughtWorks;

/**
 * User: MJ
 * Date: 13-11-16
 * Time: 下午2:23
 * Project: AnnotationTest
 */
public class Mile extends Length
{
    public static final int RELATIVE_RATE = 1760 * 3 *12;
    public static final String UNIT_NAME = "mile";
    public Mile(int value)
    {
        super(value);
        lengthInfo.setName(UNIT_NAME);
        lengthInfo.setRelativeValue(value * RELATIVE_RATE);
        lengthInfo.setRelativeRate(RELATIVE_RATE);
    }
}
