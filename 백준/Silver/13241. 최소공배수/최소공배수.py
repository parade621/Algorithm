import sys

def moc(a,b):
    while b!= 0:
        r= a % b
        a = b
        b = r
    return a

a,b = map(int, sys.stdin.readline().split())
t = moc(a,b)
if t == 0:
    print(a*b)
else:
    print(a*(b//t))