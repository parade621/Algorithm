from math import factorial
for _ in range(int(input())):
    s = list(map(int,input().split()))
    s.sort()
    print(int(factorial(s[1])/(factorial(s[0])*factorial(s[1]-s[0]))))