N,B = map(int, input().split())
result=[]
while N>0:
    tmp = N%B
    N=N//B
    if 9 < tmp:
        result.append(chr(tmp+55))
    else:
        result.append(chr(tmp+48))
print(''.join(result[::-1]))