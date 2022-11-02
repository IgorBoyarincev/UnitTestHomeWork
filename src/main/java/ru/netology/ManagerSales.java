package ru.netology;

public class ManagerSales {
    protected long[]sales;
    public ManagerSales(long[]sales){
        this.sales=sales;
    }
    public long max(){
        long max=Long.MIN_VALUE;
        for(long sale:sales){
            if(max<sale){
                max=sale;
            }
        }
        return max;
    }
    public long min(){
        long min=Long.MAX_VALUE;
        for(long sale:sales){
            if(min>sale){
                min=sale;
            }
        }
        return min;
    }
    public long gutAverage(){
        long sum=0;
        for(long sale:sales){
            sum+=sale;
        }
        return (sum-min()-max())/(sales.length/2);
    }
}
