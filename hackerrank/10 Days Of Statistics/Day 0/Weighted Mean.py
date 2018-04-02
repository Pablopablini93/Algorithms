def weight_mean(X, W):
    all_weights = 0
    sum = 0
    for weight in W:
        all_weights += weight
    for i in range(0, len(X)):
        sum += (X[i] * W[i])
    return float(sum/all_weights)


n = int(input())
X = [int(token) for token in input().split()]
Y = [int(token) for token in input().split()]
print("%.1f" % weight_mean(X, Y))