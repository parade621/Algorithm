from string import ascii_lowercase

def solution(s):
    a=list(ascii_lowercase)
    b= [False for i in range(len(a))]
    tmp=''
    for i in s:
        if tmp != i and b[a.index(i)] != True:
            tmp = i
            b[a.index(i)] = True
        elif tmp != i and b[a.index(i)] == True:
            return 0
    return 1

c=0
for i in range(int(input())):
    c+= solution(input())
print(c)