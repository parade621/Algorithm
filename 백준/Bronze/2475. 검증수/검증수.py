l = list(map(int, input().split()))
r=0
for i in l:
    r+=i*i
print(r%10)