import heapq as heap
import sys
input = sys.stdin.readline
s=[]
for _ in range(int(input())):
    n=int(input())
    if n == 0:
        if len(s) == 0:
            print(0)
        else:
            print(-heap.heappop(s))
    else:
        if len(s)>0:
            heap.heappush(s, -n)
        else:
            s.append(-n)
            heap.heapify(s)