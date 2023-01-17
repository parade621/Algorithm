from collections import deque as d
n = int(input())
s=d()
for i in range(n):
    a=int(input())
    if a == 0:
        s.pop()
    else:
        s.append(a)

print(sum(s))