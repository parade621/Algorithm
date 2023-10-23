from collections import deque
def result(n, l):
    s=deque()
    r = 1

    while r<=n:
        while l and l[0] == r:
            l.popleft()
            r+=1
        
        while s and s[-1] == r:
            s.pop()
            r+=1

        if l:
            s.append(l.popleft())
        elif s and s[-1]!=r:
            return "Sad"
        elif not l and not s:
            break
    return "Nice"

n = int(input())
l = deque(map(int, input().split()))
print(result(n,l))