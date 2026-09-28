pub fn change_percent(open:f64,close:f64)->f64{if open==0.0{0.0}else{(close-open)/open*100.0}}
pub fn moving_average(values:&[f64],window:usize)->Vec<f64>{if window==0||window>values.len(){return vec![]}(window-1..values.len()).map(|i|values[i+1-window..=i].iter().sum::<f64>()/window as f64).collect()}
