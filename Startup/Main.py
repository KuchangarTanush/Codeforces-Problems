import sys

input = sys.stdin.readline

t = int(input())

for _ in range(t):
    n, k = map(int, input().split())

    brands = [0] * (k + 1)

    for _ in range(k):
        b, c = map(int, input().split())
        brands[b] += c

    brands.sort(reverse=True)

    print(sum(brands[:n]))