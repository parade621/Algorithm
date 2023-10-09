n = int(input())
cursor = 0
s = []
t = []
wrong = False
for _ in range(n):
    k = int(input())
    if( k > cursor):
        while k != cursor:
            s.append('+')
            cursor+=1
            t.append(cursor)
        s.append('-')
        t.pop()
    else:
        if(k<t[-1]):
            wrong = True    
            break
        while True:
            if(k==t[-1]):
                s.append('-')
                t.pop()
                break
            else:
                s.append('-')
                t.pop()
if wrong:
    print('NO')
else:
    for i in s:
        print(i)