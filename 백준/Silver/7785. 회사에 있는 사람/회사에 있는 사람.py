import sys

n = int(sys.stdin.readline())
names = set()

for _ in range(n):
    name, action = sys.stdin.readline().split()
    
    if action == "enter":
        names.add(name)
    else:
        names.remove(name)

for name in sorted(names, reverse=True):
    print(name)
