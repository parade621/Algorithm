str=input()
s=[]
r=0
for i in range(len(str)):
    if str[i] == ")":
        if str[i-1]=="(":
            s.pop()
            r+=len(s)
        else:
            s.pop()
            r+=1
    else:
        s.append('(')
print(r)