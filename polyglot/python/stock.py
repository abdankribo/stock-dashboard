def change_percent(open_price, close_price):
    return 0.0 if open_price == 0 else (close_price-open_price)/open_price*100

def moving_average(values, window):
    if window <= 0 or window > len(values):
        return []
    return [sum(values[i-window+1:i+1])/window for i in range(window-1,len(values))]
