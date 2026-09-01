t = int(input())

for _ in range(t):
    a = input()
    b = input()

    s = a + b
    distinct = len(set(s))

    print(distinct - 1)