from collections import deque
while True:
    n = int(input())
    if n==-1:
        break
    dq=deque()
    for i in range(1,n//2+2):
        if n%i==0:
            dq.append(i)
    if sum(dq)==n:
        print(f"{n} = "+' + '.join(map(str,dq)))
    else:
        print(f"{n} is NOT perfect.")