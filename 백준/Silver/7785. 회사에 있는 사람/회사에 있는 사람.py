n = int(input())
names = set()

for _ in range(n):
    name, action = input().split()
    
    if action == "enter":
        names.add(name)
    else:
        names.remove(name)

for name in sorted(names, reverse=True):
    print(name)