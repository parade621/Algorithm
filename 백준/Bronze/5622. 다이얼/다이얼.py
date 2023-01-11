from string import ascii_uppercase
s=list(ascii_uppercase)
c=[2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,7,8,8,8,9,9,9,9]
sum=0
for i in input():
    sum+= c[s.index(i)]+1
print(sum)