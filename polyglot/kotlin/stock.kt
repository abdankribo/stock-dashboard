fun changePercent(open:Double,close:Double)=if(open==0.0)0.0 else (close-open)/open*100
fun movingAverage(values:List<Double>,window:Int)=if(window<=0||window>values.size)emptyList() else (window-1 until values.size).map{i->values.subList(i-window+1,i+1).average()}
