s=input().split('-')
n=[]
for i in s:
    n.append(sum(list(map(int, i.split('+')))))
print(n[0] - sum(n[1:len(n)]))