package com.exxample.junit;

/**
 * Created by lenovo on 2016/3/28.
 */
public class Fuli {

    private double  Value=0;
    private double  Year=0;
    private double  Money=0;  //收益
    private double  Rate=0;
    private double  Number=0;
    public double CaMoney(double  Value,double  Rate,double  Year){

        Money=Value*Math.pow((1+Rate ),Year );
        System.out.print("收益:");
        System.out.print(Money);
         return Money ;
    }
    public double CaBMoney(double  Value,double  Rate,double  Year){
        Money=Value*(1+Rate*Year );
        System.out.print("收益:");
        System.out.print(Money);
        return Money ;
    }
    public double CaValue(double Money  ,double  Rate,double  Year){

        Value=Money/Math.pow((1+Rate ),Year ) ;
        System.out.print("本金:");
        System. out.print(Value);
        return Value ;
    }

    public double CaRate(double  Value,double  Money,double  Year){
        Rate=Math.pow((Money/Value),1/Year)-1;
        System. out.print("利率:");
        System. out.print(Rate);
        return Rate ;
    }
    public double CaYear(double  Value,double  Rate,double  Money){
        Year=(Math.log(Money/Value))/(Math.log(1+Rate));
        System. out.print("年限:");
        System.out.print(Year);
        return Year ;
    }
    public double CaAMoney(double  Value,double  Rate,double  Number){
        Money=Value*(1+Rate)*(-1+Math.pow((1+Rate),Number))/Rate ;
        System.out.print("金额:");
        System. out.print(Money);
        return Money ;
    }



}
