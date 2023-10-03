N,B = map(str, input().split())
B= int(B)
result=0
for i in range(len(N)):
    tmp = ord(N[i])
    if 'A' <= N[i] <= 'Z':
        result = result*B + (tmp - 55)
    elif '0' <= N[i] <= '9':
        result = result*B + (tmp - 48)
print(result)