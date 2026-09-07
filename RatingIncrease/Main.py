t = int(input())

for _ in range(t):
    s = input().strip()
    found = False

    for i in range(1, len(s)):
        a = s[:i]
        b = s[i:]

        # b should not start with 0
        if b[0] == '0':
            continue

        if int(b) > int(a):
            print(a, b)
            found = True
            break

    if not found:
        print(-1)