import numpy as np


X = np.array([[1000, 2],
              [1500, 3],
              [2000, 4]])

y = np.array([50, 75, 100])


X = X / np.max(X, axis=0)


w = np.zeros(2)
b = 0


lr = 0.01
epochs = 1000

n = len(y)

for _ in range(epochs):
    y_pred = np.dot(X, w) + b
    
    # gradients
    dw = (-2/n) * np.dot(X.T, (y - y_pred))
    db = (-2/n) * np.sum(y - y_pred)
    
    
    w -= lr * dw
    b -= lr * db

print("Weights:", w)
print("Bias:", b)


new_house = np.array([1800, 3]) / np.max(X, axis=0)
pred_price = np.dot(new_house, w) + b
print("Predicted Price:", pred_price)