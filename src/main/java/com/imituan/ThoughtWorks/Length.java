package com.imituan.ThoughtWorks;

public abstract class Length
{
    protected LengthInfo lengthInfo;

    public Length(int value)
    {
        lengthInfo = new LengthInfo();
        this.lengthInfo.setValue(value);
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Length)) return false;

        Length length = (Length) o;

        if(lengthInfo.getName().equals(length.lengthInfo.getName()))
        {
            if (lengthInfo.getValue() != length.lengthInfo.getValue()) return false;
        }
        else
        {
            if (lengthInfo.getRelativeValue() != length.lengthInfo.getRelativeValue()) return false;
        }

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = lengthInfo.getName().hashCode();
        result = 31 * result + lengthInfo.getValue();
        result = 31 * result + lengthInfo.getRelativeValue();
        return result;
    }

    public String display()
    {
        LengthDisplay lengthDisplay = new LengthDisplay();
        return lengthDisplay.displayLength(this);
    }


    public String displayToInch()
    {
        LengthDisplay lengthDisplay = new LengthDisplay();
        return lengthDisplay.displayLengthToInch(this);
    }
}
