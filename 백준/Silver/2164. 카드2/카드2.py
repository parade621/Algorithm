from collections import deque as dq
n=int(input())
d=dq(i for i in range(1,n+1))

while(len(d) !=1):
    d.popleft()
    d.append(d.popleft())
print(d.popleft())