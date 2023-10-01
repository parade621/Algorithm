str = input()
r=1
for i in range(len(str)//2):
    j= len(str)-i-1
    if(str[i] != str[j]):
        r=0
        break
print(r)