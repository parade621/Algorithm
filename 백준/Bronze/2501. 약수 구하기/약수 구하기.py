from collections import deque
n,k=map(int, input().split())
dq=deque()
for i in range(1,n//2+1):
    if(n%i==0):
        dq.append(i)
dq.append(n)
try:
    print(dq[k-1])
except IndexError:
    print(0)