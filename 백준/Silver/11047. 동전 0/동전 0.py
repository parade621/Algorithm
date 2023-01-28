n,k=map(int,input().split())
coins=[0]*n
count=0
for i in range(n):
    coins[i]=int(input())
coins.reverse()
for i in coins:
    if i <= k:
        count += k//i
        k = k%i
print(count)