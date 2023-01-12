import math

n=int(input())
s= list(int(input()) for _ in range(n))
s.sort()
r=[]
a=[s[i]-s[i-1] for i in range(1,n)]

tmp = a[0]
for i in range(1, len(a)):
    tmp = math.gcd(tmp, a[i])

for i in range(2, int(math.sqrt(tmp))+1):
    if tmp % i == 0:
        r.append(i)
        r.append(tmp//i)
r.append(tmp)
r=list(set(r))
r.sort()
print(*r)
