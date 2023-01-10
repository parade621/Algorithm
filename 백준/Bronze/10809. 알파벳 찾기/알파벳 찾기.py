from string import ascii_lowercase
a=list(ascii_lowercase)
s=input()
for i in a:
    if s.count(i) != 0:
        print(s.index(i), end=" ")
    else:
        print(-1, end=" ")
