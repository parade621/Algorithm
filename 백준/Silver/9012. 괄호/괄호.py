for _ in range(int(input())):
    s=list(input())
    l=[]
    for i in range(len(s)):
        if s[i] == '(':
            l.append(s[i])
        elif s[i] == ')':
            if len(l)>0:
                l.pop()
            else:
                print("NO")
                break
        if i == len(s)-1:
            if len(l)==0:
                print("YES")
            else:
                print("NO")