from itertools import permutations as p
n, m = map(int, input().split())
a = [i for i in range(1, n+1)]
s=p(a,m)
for i in s:
    print(*i)