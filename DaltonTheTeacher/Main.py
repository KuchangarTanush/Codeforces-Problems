t=int(input())
for _ in range(t):
    n=int(input())
    p=list(map(int,input().split()))
    k=0
    for i in range(n):
        if p[i]==i+1:
            k+=1
    print((k+1)//2)