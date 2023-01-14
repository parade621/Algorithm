import sys
input = sys.stdin.readline

def t(s):
    c=0
    while s!=0:
        s=s//2
        c+=s
    return c

def f(s):
    c=0
    while s!=0:
        s=s//5
        c+=s
    return c

a,b = map(int,input().split())
print(min(t(a)-t(a-b)-t(b), f(a)-f(a-b)-f(b)))