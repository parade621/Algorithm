from math import factorial
a, b = map(int, input().split())
r=factorial(a)//(factorial(b)*factorial(a-b))
print(r % 10007)
