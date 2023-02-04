s=[]
n=int(input())
for _ in range(n):
    s.append(list(map(int,input().split())))

s.sort(key=lambda x:(x[1],x[0]))
c=1
t=s[0][1]
for i in range(1, n):
    if s[i][0] >= t:
        c+=1
        t=s[i][1]
print(c)