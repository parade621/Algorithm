import sys
input = sys.stdin.readline

def gcd(a,b):
    while b:
        a,b = b,a%b
    return a

A = list(map(int, input().split()))
B = list(map(int, input().split()))
g = gcd(A[1],B[1])
ra = (A[0]*(B[1]//g)) + (B[0]*(A[1]//g))
rb = A[1]*B[1]//g
g=gcd(ra,rb)
ra //=g
rb //=g
print(ra, rb)