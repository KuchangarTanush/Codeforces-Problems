t = int(input())

for _ in range(t):
    n = int(input())
    a = list(map(int, input().split()))

    a.sort()

    ans = 0

    for i in range(1, n, 2):
        ans += a[i]

    if n % 2 == 1:
        ans += a[-1]

    print(ans)