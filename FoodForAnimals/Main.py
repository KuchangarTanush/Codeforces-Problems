t=int(input())
for _ in range(t):
    a,b,c,x,y=map(int,input().split())
    x-=min(x,a)
    y-=min(y,b)
    if x+y<=c:
        print("yes")
    else:
        print("no")
