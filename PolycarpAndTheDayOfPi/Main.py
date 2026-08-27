pi = "314159265358979323846264338327"

t = int(input())

for _ in range(t):
    n = input().strip()

    ans = 0

    for i in range(len(n)):
        if n[i] == pi[i]:
            ans += 1
        else:
            break

    print(ans)