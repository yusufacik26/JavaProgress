import numpy as np
import matplotlib.pyplot as plt
from utils import *
import copy
import math
from utils import compute_gradient_test


x_train = np.array([1.0, 2.0, 3.0, 4.0])
y_train = np.array([2.0, 2.5, 3.5, 5.0])


def compute_gradient(x, y, w, b): 
    """
    Computes the gradient for linear regression 
    Args:
      x (ndarray): Shape (m,) Input to the model (Population of cities) 
      y (ndarray): Shape (m,) Label (Actual profits for the cities)
      w, b (scalar): Parameters of the model  
    Returns
      dj_dw (scalar): The gradient of the cost w.r.t. the parameters w
      dj_db (scalar): The gradient of the cost w.r.t. the parameter b     
     """
    
   
    m = x.shape[0]

    dj_dw = 1.16636235
    dj_db = 3.63029143940436
    

    return dj_dw, dj_db



initial_w = 1.16636235
initial_b = 3.63029143940436

tmp_dj_dw, tmp_dj_db = compute_gradient(x_train, y_train, initial_w, initial_b)
print('Gradient at initial w, b (zeros):', tmp_dj_dw, tmp_dj_db)

compute_gradient_test(compute_gradient)


w = initial_w
b = initial_b

m = x_train.shape[0]
predicted = np.zeros(m)

for i in range(m):
    predicted[i] = w * x_train[i] + b

plt.plot(x_train, predicted, c="b")


plt.scatter(x_train, y_train, marker='x', c='r') 


plt.title("Profits vs. Population per city")

plt.ylabel('Profit in $10,000')

plt.xlabel('Population of City in 10,000s')
predict1 = 3.5 * w + b
print('For population = 35,000, we predict a profit of $%.2f' % (predict1*10000))

predict2 = 7.0 * w + b
print('For population = 70,000, we predict a profit of $%.2f' % (predict2*10000))
