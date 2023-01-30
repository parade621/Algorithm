from collections import deque
n,k=map(int, input().split())
s=list(map(int, input().split()))
m=None
tmp=0
q=deque()
cnt=0
for i in s:
    q.append(i)
    tmp+=i
    cnt+=1
    if cnt == k:
        if m==None or tmp>m:
            m=tmp
        tmp-=q.popleft()
        cnt -= 1
print(m)