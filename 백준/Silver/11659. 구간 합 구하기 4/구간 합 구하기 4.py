import sys
input = sys.stdin.readline

n,m=map(int,input().split())
s=list(map(int,input().split()))
sumList=[0]
tmp=0
for i in s:
    tmp+=i
    sumList.append(tmp)

for _ in range(m):
    i,j = map(int,input().split())
    print(sumList[j]-sumList[i-1])