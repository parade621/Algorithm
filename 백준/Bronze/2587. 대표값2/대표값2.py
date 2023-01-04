s=[]
for i in range(5):
    s.append(int(input()))
s.sort()
print(int(sum(s)/5))
print(s[5//2])