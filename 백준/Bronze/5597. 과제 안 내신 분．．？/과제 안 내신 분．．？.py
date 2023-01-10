s = list(range(1,31))
for i in range(28):
    n=int(input())
    if n in s:
        s.remove(n)
print(min(s))
print(max(s))