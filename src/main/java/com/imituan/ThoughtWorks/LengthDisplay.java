package com.imituan.ThoughtWorks;

public class LengthDisplay
{
    private int remainder = 0;
    private String displayResult = "";

    public String displayLength(Length length)
    {
        remainder = length.lengthInfo.getRelativeValue();
        if (remainder == 0)
            return "0 inch";
        makeResultInThisLevel(Mile.RELATIVE_RATE, Mile.UNIT_NAME);
        makeResultInThisLevel(Yard.RELATIVE_RATE, Yard.UNIT_NAME);
        makeResultInThisLevel(Feet.RELATIVE_RATE, Feet.UNIT_NAME);
        makeResultInThisLevel(Inch.RELATIVE_RATE, Inch.UNIT_NAME);
        return displayResult;
    }

    private void makeResultInThisLevel(int relativeRate, String unitName)
    {
        if (remainder / relativeRate != 0)
        {
            if (displayResult.equals(""))
                displayResult = remainder / (relativeRate) +" "+unitName;
            else
                displayResult = displayResult + " " + remainder / relativeRate +" "+unitName;
            remainder = remainder % relativeRate;
        }
    }


    public String displayLengthToInch(Length length)
    {
        return length.lengthInfo.getRelativeValue()+" inch";
    }
}
