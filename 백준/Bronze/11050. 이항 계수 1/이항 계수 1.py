from itertools import combinations

a,b = map(int, input().split())
c= combinations(range(a),b)
r=0
for i in c:
    r+=1
print(r)