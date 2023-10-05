import sys
from collections import deque

# 입력 받기
n = int(sys.stdin.readline())
stack = deque()
results = []

for _ in range(n):
    command = list(map(int, sys.stdin.readline().split()))
    
    if command[0] == 1:  # push
        stack.append(command[1])
    elif command[0] == 2:  # pop
        if stack:
            results.append(str(stack.pop()))
        else:
            results.append("-1")
    elif command[0] == 3:  # size
        results.append(str(len(stack)))
    elif command[0] == 4:  # empty
        if stack:
            results.append("0")
        else:
            results.append("1")
    elif command[0] == 5:  # top
        if stack:
            results.append(str(stack[-1]))
        else:
            results.append("-1")

print("\n".join(results))
