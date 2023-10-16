import sys

def is_prime(n):
    if n <= 1:
        return False
    if n == 2:
        return True
    if n % 2 == 0:
        return False
    for i in range(3, int(n**0.5) + 1, 2):
        if n % i == 0:
            return False
    return True

n = int(sys.stdin.readline())
for _ in range(n):
    a = int(sys.stdin.readline())
    while True:
        if is_prime(a):
            print(a)
            break
        a += 1
