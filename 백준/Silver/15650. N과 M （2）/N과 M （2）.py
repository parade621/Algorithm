n,m=map(int,input().split())
s=[]
r=[]
def dfs(tmp):
    if len(s)==m:
        print(' '.join(map(str,s)))
        return
    for i in range(tmp,n+1):
        if i not in s:
            s.append(i)
            dfs(i+1)
            s.pop()
dfs(1)