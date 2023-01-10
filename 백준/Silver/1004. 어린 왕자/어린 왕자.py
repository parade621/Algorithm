import sys
input = sys.stdin.readline

t = int(input())
for i in range(t):
    x1, y1, x2, y2 = map(int, input().split())
    n= int(input())
    s=[]
    c=0
    for i in range(n):
        cx,cy,r = map(int,input().split())
        dis1 = (x1-cx)**2 + (y1-cy)**2
        dis2 = (x2-cx)**2 + (y2-cy)**2
        r = r**2
        if r > dis1 and r > dis2:
            pass
        elif r > dis1:
            c+=1
        elif r > dis2:
            c+=1
    print(c)