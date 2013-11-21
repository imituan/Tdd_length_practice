package com.imituan.ThoughtWorks;

public class LengthFactory
{

    public static Length makeLengthUnit(LengthType lengthType, int value) throws Exception
    {
        switch (lengthType)
        {
            case MILE:
                return new Mile(value);
            case YARD:
                return new Yard(value);
            case FEET:
                return new Feet(value);
            case INCH:
                return new Inch(value);
            default:
                throw new Exception("Invalid Length Unit Type!");
        }
    }

    public static Inch plusToInch(Length length, Length length1) throws Exception
    {
        Length inch = makeLengthUnit(LengthType.INCH, 0);
        inch.lengthInfo.setRelativeValue(length.lengthInfo.getRelativeValue() + length1.lengthInfo.getRelativeValue());
        inch.lengthInfo.setValue(inch.lengthInfo.getRelativeValue());
        return (Inch) inch;
    }
}
