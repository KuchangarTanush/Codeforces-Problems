t = int(input())

for _ in range(t):
    s = input()
    count = 0
    for i in range(3):
        if s[i] != "abc"[i]:
            count += 1
    if count == 0 or count == 2:
        print("YES")
    else:
        print("NO")