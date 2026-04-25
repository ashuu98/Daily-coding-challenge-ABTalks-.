
import numpy as np

# Sample data (X = input, y = output)
X = np.array([1, 2, 3, 4, 5])
y = np.array([2, 4, 5, 4, 5])

# Step 1: mean
x_mean = np.mean(X)
y_mean = np.mean(y)

# Step 2: calculate slope (m)
numerator = np.sum((X - x_mean) * (y - y_mean))
denominator = np.sum((X - x_mean) ** 2)

m = numerator / denominator

# Step 3: calculate intercept (b)
b = y_mean - m * x_mean

print("Slope (m):", m)
print("Intercept (b):", b)

# Step 4: prediction function
def predict(x):
    return m * x + b

# Test prediction
print("Prediction for x=6:", predict(6))