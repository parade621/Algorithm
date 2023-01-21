from collections import deque as dq
import sys
input = sys.stdin.readline

d = dq()
c = 0
for _ in range(int(input())):
    s = list(map(str, input().split()))
    if s[0] == 'push_front':
        d.appendleft(s[1])
        c += 1
    elif s[0] == "push_back":
        d.append(s[1])
        c+=1
    elif s[0] == "pop_front":
        if c == 0:
            print(-1)
        else:
            print(d.popleft())
            c -= 1
    elif s[0] == 'pop_back':
        if c == 0:
            print(-1)
        else:
            print(d.pop())
            c -= 1
    elif s[0] == 'size':
        print(c)
    elif s[0] == 'empty':
        if c == 0:
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