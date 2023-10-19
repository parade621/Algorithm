import sys
from collections import deque
d=deque()
for _ in range(int(input())):
    l= list(map(int, sys.stdin.readline().split()))
    if(len(l)>1):
        if l[0] == 1:
            d.appendleft(l[1])
        elif l[0] == 2:
            d.append(l[1])
    else:
        if l[0] == 3:
            if d:
                print(d.popleft())
            else:
                print(-1)
        elif l[0] == 4:
            if d:
                print(d.pop())
            else:
                print(-1)
        elif l[0] == 5:
            print(len(d))
        elif l[0] == 6:
            if d:
                print(0)
            else:
                print(1)
        elif l[0] == 7:
            if d:
                print(d[0])
            else:
                print(-1)
        elif l[0] == 8:
            if d:
                print(d[-1])
            else:
                print(-1)