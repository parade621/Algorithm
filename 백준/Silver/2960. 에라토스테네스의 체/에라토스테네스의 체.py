n,k = map(int, input().split())
r=0
d = [True]*(n+1)
for i in range(2, n+1):
    if d[i]==True:
        for j in range(i, n+1, i):
            if d[j] == True:
                d[j]=False
                r+=1
                if r==k:
                    print(j)
                    break