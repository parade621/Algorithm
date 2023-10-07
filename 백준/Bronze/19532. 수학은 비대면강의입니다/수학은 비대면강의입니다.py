l = list(map(int, input().split()))

a, b, c, d, e, f = l

x = (c * e - b * f) // (a * e - b * d)
y = (a * f - c * d) // (a * e - b * d)

print(x, y)
