import sys
from collections import deque
input = sys.stdin.readline
for _ in range(int(input())):
    c=input()
    n=int(input())
    q2 = deque(input()[1:-2].split(','))
    cR=0
    if n==0:
        q2=[]
    
    for i in c:
        if i == "R":
            cR+=1
        elif i == "D":
            if len(q2)==0:
                print("error")
                break
            else:
                if cR%2==0:
                    q2.popleft()
                else:
                    q2.pop()
    else:
        if cR%2==0:
            print('['+",".join(q2)+']')
        else:
            q2.reverse()
            print('['+",".join(q2)+']')