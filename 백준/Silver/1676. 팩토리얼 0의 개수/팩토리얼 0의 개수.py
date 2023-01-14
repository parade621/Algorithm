from math import factorial as f
s = str(f(int(input())))
r=0
for i in range(len(s)-1,0,-1):
    if s[i]=='0':
        r+=1
    else:
        break
print(r)