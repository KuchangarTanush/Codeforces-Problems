
t=int(input())
for _ in range(t):
    a,b,c=map(int,input().split())
    diff = abs(a - b)
    ans = (diff + 2 * c - 1) // (2 * c)
    print(ans)