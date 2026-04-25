
import numpy as np

# Data
X = np.array([1, 2, 3, 4, 5])
y = np.array([2, 4, 5, 4, 5])

# Initialize parameters
m = 0
b = 0

# Hyperparameters
learning_rate = 0.01
epochs = 1000
n = len(X)

# Gradient Descent
for i in range(epochs):
    y_pred = m * X + b

    # Gradients
    dm = (-2/n) * np.sum(X * (y - y_pred))
    db = (-2/n) * np.sum(y - y_pred)

    # Update
    m = m - learning_rate * dm
    b = b - learning_rate * db

    # Print loss occasionally
    if i % 100 == 0:
        loss = np.mean((y - y_pred) ** 2)
        print(f"Epoch {i}, Loss: {loss:.4f}")

print("\nFinal m:", m)
print("Final b:", b)

# Prediction
print("Prediction for x=6:", m*6 + b)