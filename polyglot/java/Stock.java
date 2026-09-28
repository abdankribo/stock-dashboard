import java.util.*;
public class Stock {
 public static double changePercent(double open,double close){return open==0?0:(close-open)/open*100;}
 public static List<Double> movingAverage(List<Double> values,int window){List<Double> r=new ArrayList<>();if(window<=0||window>values.size())return r;for(int i=window-1;i<values.size();i++){double s=0;for(int j=i-window+1;j<=i;j++)s+=values.get(j);r.add(s/window);}return r;}
}
