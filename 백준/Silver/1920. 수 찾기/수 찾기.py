import sys
input = sys.stdin.readline
n=int(input())
s=list(map(int,input().split()))
m=int(input())
c=list(map(int,input().split()))
s.sort()

for i in c:
    l, r = 0, n-1
    find = False

    while l <= r:
        mid = (l+r)//2
        if i == s[mid]:
            find = True
            print(1)
            break
        elif i > s[mid]:
            l = mid + 1
        else:
            r = mid - 1

    if not find:
        print(0)