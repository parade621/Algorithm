while True:
    s = list(map(int, input().split()))
    if sum(s) == 0:
        break
    n = max(s)
    s.remove(n)
    if s[0]**2 + s[1]**2 == n**2:
        print("right")
    else:
        print("wrong")