from itertools import permutations as p
n,m = map(int,input().split())
a=[i for i in range(1,n+1)]
a=p(a,m)
s=[]
for i in a:
    t = sorted(list(i))
    if t in s:
        pass
    else:
        s.append(sorted(list(i)))
for i in s:
    print(*i)