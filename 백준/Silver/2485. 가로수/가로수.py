import sys
input = sys.stdin.readline
n = int(input())
l = [int(input()) for _ in range(n)]
d = [l[i+1] - l[i] for i in range(n-1)]
def gcd(a, b):
    while b:
        a, b = b, a % b
    return a

g = d[0]
for i in range(1, len(d)):
    g = gcd(g, d[i])

t=0
for i in d:
    t += (i//g)-1

print(t)