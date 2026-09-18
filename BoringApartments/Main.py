t=int(input())
for _ in range(t):
    n=input()
    digit=int(n[0])
    length=len(n)
    ans=(digit - 1)*10+length*(length+1)//2
    print(ans)