static int getmaxprofit(int[] prices)
{
    int minsofar = prices[0];
    int maxprofit = 0;

    for(int i=1; i<prices.length; i++)
    {
        if(arr[i]<minsofar)
        {minsofar=prices[i];}
        int profit = prices[i] - minsofar;
        if(profit>maxprofit){maxprofit=profit;}
    }
    return maxprofit;
}