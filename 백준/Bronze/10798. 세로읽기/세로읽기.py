str = [list(input()) for _ in range(5)]
result=''
m = len(max(str, key=len))
for i in range(m):
    for j in range(5):
        try:
            result+=str[j][i]
        except IndexError:
            pass
print(result)