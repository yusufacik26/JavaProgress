import numpy as np


from utils import *


x_train = np.array([2.0, 1.0, 3.0, 4.0])
y_train = np.array([2.0, 4.5, 3.5, 5.0])


def compute_cost(x, y, w, b):
    m = x.shape[0]  
    total_cost = 0 
    
    for i in range(m):
        f_wb = w * x[i] + b
        cost = (f_wb - y[i])**2
        total_cost += cost
        
    total_cost = total_cost / (2 * m)
    
    return total_cost

initial_w = 7
initial_b = 1


cost = compute_cost(x_train, y_train, initial_w, initial_b)
print(f'Cost at initial w: {cost:.3f}')


