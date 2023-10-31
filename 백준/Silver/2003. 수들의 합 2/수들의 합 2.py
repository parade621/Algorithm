import sys

n,m = map(int, sys.stdin.readline().split())
l = list(map(int, sys.stdin.readline().split()))
s,e,r,sum=0,0,0,0
while e<n:
    if sum < m:
        sum += l[e]
        e+=1
    elif sum > m:
        sum -= l[s]
        s+=1
    else:
        r+=1
        sum-=l[s]
        s+=1
while s<n and sum >= m:
    if sum == m:
        r+=1
    sum -= l[s]
    s+=1

    
print(r)