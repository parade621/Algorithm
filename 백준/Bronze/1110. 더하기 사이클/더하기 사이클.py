n = int(input())
r=1
a = (n%10)*10+(n//10 + n%10)%10
while True:
    if a==n:
        print(r)
        break
    else:
        a = (a%10)*10+(a//10 + a%10)%10
        r+=1