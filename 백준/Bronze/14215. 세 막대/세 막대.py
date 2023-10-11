t=list(map(int,input().split()))
t.sort()
if(t[-1]>=t[0]+t[1]):
    print((t[0]+t[1])*2-1)
else:
    print(sum(t))