n,m = map(int,input().split())
a = list(map(int, input().split()))
b = list(map(int, input().split()))
c= []
s,e=0,0
while s<n and e< m:
    if a[s] < b[e]:
        c.append(a[s])
        s+=1
    else:
        c.append(b[e])
        e+=1

while s<n:
    c.append(a[s])
    s+=1
while e<m:
    c.append(b[e])
    e+=1
print(' '.join(map(str, c)))