t = int(input())

for _ in range(t):
    s = input().strip()

    first = ord(s[0]) - ord('a')
    second = ord(s[1]) - ord('a')

    ans = first * 25 + second + 1

    if second > first:
        ans -= 1

    print(ans)