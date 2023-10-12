d={}
for i in range(int(input())):
    a,b=map(str,input().split())
    if(b=="leave"):
        del(d[a])
    else:
        d[a]=b
d=reversed(sorted(d))
for i in d:
    print(i)