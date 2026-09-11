t = int(input())

for _ in range(t):
    n = int(input())
    a = list(map(int, input().split()))

    odd_parity = a[0] % 2
    even_parity = a[1] % 2

    possible = True

    for i in range(0, n, 2):
        if a[i] % 2 != odd_parity:
            possible = False

    for i in range(1, n, 2):
        if a[i] % 2 != even_parity:
            possible = False

    if possible:
        print("YES")
    else:
        print("NO")