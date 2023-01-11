s = input().upper()
d = dict.fromkeys(s,0)
for i in s:
    d[i] +=1
tmp = max(d.values())
c = 0
r=""
for i in d:
    if d.get(i) == tmp:
        r=i
        c+=1
if c == 1:
    print(r)
else:
    print('?')