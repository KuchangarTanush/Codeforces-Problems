t = int(input())

for _ in range(t):
    n, s = map(int, input().split())
    x = list(map(int, input().split()))

    l = x[0]
    r = x[-1]

    ans = (r - l) + min(abs(s - l), abs(s - r))

    print(ans)