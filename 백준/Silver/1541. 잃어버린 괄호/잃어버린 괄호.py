s=input().split('-')
n=[]
for i in s:
    cnt=0
    a=i.split('+')
    for j in a:
        cnt += int(j)
    n.append(cnt)
result = n[0]
for i in range(1,len(n)):
    result -= n[i]
print(result)