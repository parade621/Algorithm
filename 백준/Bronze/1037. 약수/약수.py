import sys
import math
input = sys.stdin.readline

n = int(input())
s = list(map(int,input().split()))
s.sort()
print(s[0]*s[-1])