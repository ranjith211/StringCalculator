package org.example;

public class StringCalculator {

    public int add(String numbers)
    {
        int result=0;
        if(numbers.isEmpty())
        {
            return 0;
        }

        for(String num:numbers.split(","))
        {
            result+= Integer.parseInt(num);
        }
        return result;
    }
}
