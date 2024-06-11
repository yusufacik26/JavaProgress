
import numpy as np

def compute_gradient_test(compute_gradient_func):
    """
    Test function for compute_gradient function.
    Args:
      compute_gradient_func (function): The function that computes the gradient.
    """
   #Exercise 1
    x_test1 = np.array([1.0, 2.0, 3.0, 4.0])
    y_test1 = np.array([2.0, 2.5, 3.5, 5.0])
    initial_w_test1 = 1.16636235
    initial_b_test1 = 3.63029143940436
    dj_dw_test1, dj_db_test1 = compute_gradient_func(x_test1, y_test1, initial_w_test1, initial_b_test1)
    print('Gradient at initial w, b (test case 1):', dj_dw_test1, dj_db_test1)

   #Exercise 2
    x_test2 = np.array([1.0, 2.0, 3.0])
    y_test2 = np.array([2.0, 3.0, 4.0])
    initial_w_test2 = 0.5
    initial_b_test2 = 1.0
    dj_dw_test2, dj_db_test2 = compute_gradient_func(x_test2, y_test2, initial_w_test2, initial_b_test2)
    print('Gradient at initial w, b (test case 2):', dj_dw_test2, dj_db_test2)
