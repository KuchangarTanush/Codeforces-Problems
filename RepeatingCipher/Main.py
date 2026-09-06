n=int(input())
s=input()
ans=''
i=0
step=1
while i <n:
    ans+=s[i]
    i+=step
    step+=1
print(ans)