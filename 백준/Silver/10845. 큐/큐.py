from collections import deque as dq
import sys
input = sys.stdin.readline

d=dq()
c=0
for _ in range(int(input())):
    s=list(map(str,input().split()))
    if s[0] == 'push':
        d.append(s[1])
        c+=1
    elif s[0] == 'pop':
        if c==0:
            print(-1)
        else:
            print(d.popleft())
            c-=1
    elif s[0] == 'size':
        print(c)
    elif s[0] == 'empty':
        if c ==0:
            print(1)
        else:
            print(0)
    elif s[0] == 'front':
        if c == 0:
            print(-1)
        else:
            print(d[0])
    else:
        if c == 0:
            print(-1)
        else:
            print(d[c-1])