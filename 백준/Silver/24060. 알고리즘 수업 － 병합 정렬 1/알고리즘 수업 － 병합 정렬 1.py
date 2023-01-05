def merge_sort(a):
    if len(a) == 1:
        return a
    
    mid = (len(a)+1)//2

    l = merge_sort(a[:mid])
    r = merge_sort(a[mid:])

    i, j = 0, 0
    tmp = []
    while i< len(l) and j < len(r):
        if l[i] < r[j]:
            tmp.append(l[i])
            result.append(l[i])
            i+=1
        else:
            tmp.append(r[j])
            result.append(r[j])
            j+=1
    while i < len(l):
        tmp.append(l[i])
        result.append(l[i])
        i+=1
    while j < len(r):
        tmp.append(r[j])
        result.append(r[j])
        j+=1
    
    return tmp
        
n, k = map(int, input().split())
s = list(map(int,input().split()))
result=[]
merge_sort(s)

if len(result) >= k:
    print(result[k-1])
else:
    print(-1)