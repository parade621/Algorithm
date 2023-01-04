def recursion(s, l, r, c):
    if l>=r:
        return 1, c
    elif s[l] != s[r]:
        return 0, c
    else:
        return recursion(s, l+1, r-1, c+1)

def isPalindrome(s):
    count = 0
    r1,r2 = recursion(s, 0, len(s)-1, count+1)
    return r1,r2

if __name__=="__main__":
    n=int(input())
    for i in range(n):
        r1,r2=isPalindrome(input())
        print(r1,r2)