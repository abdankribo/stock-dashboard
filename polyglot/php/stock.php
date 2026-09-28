<?php
function changePercent(float $open,float $close):float{return $open==0?0:(($close-$open)/$open)*100;}
function movingAverage(array $values,int $window):array{if($window<=0||$window>count($values))return []; $r=[];for($i=$window-1;$i<count($values);$i++)$r[]=array_sum(array_slice($values,$i-$window+1,$window))/$window;return $r;}
