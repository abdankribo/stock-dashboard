package stock
func ChangePercent(o,c float64)float64{if o==0{return 0};return(c-o)/o*100}
func MovingAverage(v []float64,w int)[]float64{r:=[]float64{};for i:=w-1;i<len(v);i++{s:=0.0;for j:=i-w+1;j<=i;j++{s+=v[j]};r=append(r,s/float64(w))};return r}
