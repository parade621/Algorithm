n = int(input())
l = []
w = []
s=[]
for i in range(6):
    a, b = map(int, input().split())
    if a == 2 or a == 1:
        l.append(b)
    else:
        w.append(b)
    s.append(b)
square = max(l) * max(w)
b_l = s.index(max(l))
b_w = s.index(max(w))

s_l = abs(s[b_l-1] - s[(b_l-5 if b_l ==5 else b_l+1)])
s_w = abs(s[b_w-1] - s[(b_w-5 if b_w == 5 else b_w+1)])
print((square-(s_l*s_w))*n)