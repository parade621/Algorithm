from collections import deque as dq
for _ in range(int(input())):
    n,m = map(int, input().split())
    d = dq(map(int,input().split()))
    isPrinted = False
    c=0
    p=0
    while isPrinted != True:
        if c!=m:
            if d[0]==max(d):
                d.popleft()
                p+=1
                m-=1
            else:
                d.append(d.popleft())
                c+=1
        else:
            if max(d) > d[0]:
                d.append(d.popleft())
                m+=len(d)-c-1
                c=0
            else:
                isPrinted = True
                print(p+1)