import sys
input = sys.stdin.readline
n,x = map(int,input().split())
s = list(map(int,input().split()))
for i in s:
    if i < x:
        print(i, end=" ")