n, m = map(int, input().split())
s= list(map(int,input().split()))

r=0
for i in range(len(s)):
    for j in range(i+1, len(s)):
        for k in range(j+1, len(s)):
            tmp = s[i]+s[j]+s[k]
            if tmp <=m and r<tmp:
                r=tmp

print(r)