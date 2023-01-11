import sys
input = sys.stdin.readline

t = int(input())
for i in range(t):
    s=""
    a,b = map(str, input().split())
    for j in b:
        for k in range(int(a)):
            s+=j
    print(s)