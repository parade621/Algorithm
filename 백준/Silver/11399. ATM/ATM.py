n=int(input())
s=list(map(int,input().split()))
s.sort()
l=[0]
for i in s:
    l.append(l[-1]+i)
print(sum(l))