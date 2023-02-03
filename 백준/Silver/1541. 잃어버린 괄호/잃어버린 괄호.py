s=input().split('-')
n=[]
for i in s:
    a=list(map(int, i.split('+')))
    n.append(sum(a))
result = n[0]
result -= sum(n[1:len(n)])
print(result)