r, c = map(int, input().split())
a = [input() for _ in range(r)]

ans = 0

for i in range(r):
    for j in range(c):
        if 'S' not in a[i] or all(a[x][j] != 'S' for x in range(r)):
            ans += 1

print(ans)