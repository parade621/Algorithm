from collections import deque
n= int(input())
l = deque(map(int, input().split()))
t = deque(i+1 for i in range(n))
r = []

idx = 0

while len(r)<n:
    r.append(t[idx])
    
    step = l[idx]
    
    del l[idx]
    del t[idx]
    
    if not l:
        break
    
    if step > 0:
        idx = (idx + step-1) % len(l)
    else:
        idx = (len(l)+(idx + step))%len(l)

print(' '.join(map(str, r)))