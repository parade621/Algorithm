import sys
import math
input = sys.stdin.readline

def solution(s):
    x1,y1,r1,x2,y2,r2=s[0],s[1],s[2],s[3],s[4],s[5]
    distance = math.sqrt((x2-x1)**2 + (y2-y1)**2)
    if distance==0 :
        if abs(r1-r2) == 0:
            return -1
        else:
            return 0
    elif distance > 0:
        if  abs(r1-r2) < distance and r1+r2 > distance:
            return 2
        elif r1+r2 == distance or abs(r1-r2) == distance:
            return 1
        else:
            return 0

n=int(input())
s=[]
for i in range(n):
    print(solution(list(map(int, input().split()))))
