s=[]
m = 0
x,y=0,0
tmp = 0
for i in range(9):
    t = list(map(int, input().split()))
    if max(t) > m:
        m = max(t)
        x=tmp
        y = t.index(m)
    s.append(t)
    tmp+=1
print(m)
print(x+1, y+1)
    
