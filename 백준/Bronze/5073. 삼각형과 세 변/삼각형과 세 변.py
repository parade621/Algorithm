while True:
    t = list(map(int, input().split()))
    if(t[0] == 0):
        break
    t.sort()
    if t[-1]>=t[0]+t[1]:
        print("Invalid")
    else:
        if t[0]==t[1]==t[2]:
            print('Equilateral')
        elif t[0]==t[1] or t[0] == t[2] or t[1] == t[2]:
            print('Isosceles')
        else:
            print("Scalene")