
t=int(input())
for _ in range(t):
    n=int(input())
    if n%3==0:
        c1=n//3
        c2=n//3
    elif n%3==1:
        c1=n//3+1
        c2=n//3
    else:
        c1=n//3
        c2=n//3+1
    print(c1,c2)
