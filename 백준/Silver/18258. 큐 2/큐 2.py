import sys
from collections import deque
input = sys.stdin.readline

s = deque()
for _ in range(int(input())):
    a=list(map(str,input().split()))
    if a[0] == "push":
        s.append(a[1])
    elif a[0] == "pop":
        print(s.popleft()) if s else print(-1)
    elif a[0] == "size":
        print(len(s))
    elif a[0] == "empty":
        print(0) if s else print(1)
    elif a[0] == "front":
        print(s[0]) if s else print(-1)
    else:
        print(s[len(s)-1]) if s else print(-1)