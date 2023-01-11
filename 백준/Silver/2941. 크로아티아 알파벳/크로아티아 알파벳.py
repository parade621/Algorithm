s=list(input())
c=0
for i in range(len(s)):
    if i>0 and s[i] in ['-','=','j']:
        if s[i] == '=' and s[i-1] == "z":
            if i > 1 and s[i-2]=='d':
                c-=1
            else:
                pass
        elif s[i] == 'j': 
            if s[i-1] in ['l','n']:
                pass
            else:
                c+=1
    else:
        c+=1
print(c)