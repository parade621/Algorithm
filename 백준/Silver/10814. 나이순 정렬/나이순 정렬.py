from sys import stdin
s=[]
for _ in range(int(stdin.readline())):
    x, y=map(str,stdin.readline().split())
    s.append([int(x),y])
s.sort(key=lambda x:x[0])
for i in s:
    print(i[0],i[1])
