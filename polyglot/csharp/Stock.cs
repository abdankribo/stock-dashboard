using System.Collections.Generic;
using System.Linq;
public static class StockLogic {
 public static double ChangePercent(double open,double close)=>open==0?0:(close-open)/open*100;
 public static double[] MovingAverage(List<double> values,int window)=>window<=0||window>values.Count?new double[0]:Enumerable.Range(window-1,values.Count-window+1).Select(i=>values.Skip(i-window+1).Take(window).Average()).ToArray();
}
