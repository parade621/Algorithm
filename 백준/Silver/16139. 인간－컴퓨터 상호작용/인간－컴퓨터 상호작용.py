import sys
input = sys.stdin.readline

s=list(input())
for _ in range(int(input())):
    w,f,e = map(str,input().split())
    f=int(f)
    e=int(e)
    cnt=s[f:e+1].count(w)
    print(cnt)