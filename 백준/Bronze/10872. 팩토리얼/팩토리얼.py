n=int(input())
def f(s):
    if s == 0:
        return 1
    return s*f(s-1)
print(f(n))