#include <vector>
double changePercent(double o,double c){return o==0?0:(c-o)/o*100;}
std::vector<double> movingAverage(const std::vector<double>&v,int w){std::vector<double>r;for(int i=w-1;i<(int)v.size();++i){double s=0;for(int j=i-w+1;j<=i;++j)s+=v[j];r.push_back(s/w);}return r;}
