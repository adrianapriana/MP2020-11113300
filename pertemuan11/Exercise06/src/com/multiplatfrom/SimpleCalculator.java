package com.multiplatfrom;

public class SimpleCalculator {
    private double FirstNumber;
    private double SecondNumber;

    public double getFirstNumber(){
       return this.FirstNumber;
    }
    public double getSecondNumber(){
        return this.SecondNumber;
    }
    public void setFirstNumber(double FirstNumber){
        this.FirstNumber = FirstNumber;
    }
    public void setSecondNumber(double SecondNumber){
        this.SecondNumber = SecondNumber;
    }
    public double getAdditionResult(){
        return this.FirstNumber + this.SecondNumber;
    }
    public double getSubtractionResult(){
        return this.FirstNumber - this.SecondNumber;
    }
    public double getMultiplicationResult(){
        return this.FirstNumber * this.SecondNumber;
    }
    public double getDivisionResult(){
        if (this.SecondNumber == 0)
            return 0;
        return this.FirstNumber / this.SecondNumber;
    }
}


