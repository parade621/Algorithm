import sys

n = 1000000
l = [True] * (n)
for i in range(2, int(n**0.5) + 1):
    if l[i]:
        for j in range(i + i, n, i):
            l[j] = False

primes_set = {i for i in range(2, n) if l[i]}
primes_list = sorted(primes_set)

for _ in range(int(input())):
    n = int(sys.stdin.readline())
    r = 0
    for i in primes_list:
        if i > n // 2:
            break
        if n - i in primes_set:
            r += 1
    print(r)
