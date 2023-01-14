from collections import defaultdict as dict
from math import factorial as f
for _ in range(int(input())):
    d=dict(int)
    n = int(input())
    for _ in range(n):
        a,b=map(str,input().split())
        d[b]+=1
    r=1
    k=list(d.keys())
    for i in k:
        r*=d.get(i)+1
    print(r-1)