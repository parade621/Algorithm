s = []
strList=[]
p=[]
while 1:
    str=input()
    if str == ".":
        break
    else:
        s.append(str)
str=""
for i in s:
    if "." in i:
        str+=i
        strList.append(str)
        str=""
    else:
        str+=i
skip=False
for i in strList:
    skip=False
    for j in i:
        if skip==False:
            if j =='(' or j == '[':
                p.append(j)
            elif j == ')':
                if len(p)==0 or p[-1] != '(':
                    print("no")
                    skip=True
                    p.clear()
                    break
                else:
                    p.pop(-1)
            elif j == ']':
                if len(p) == 0 or p[-1] != '[':
                    print("no")
                    skip = True
                    p.clear()
                    break
                else:
                    p.pop(-1)
            elif j == '.' :
                if len(p)==0:
                    print("yes")
                else:
                    print("no")
                    p.clear()
        else:
            break