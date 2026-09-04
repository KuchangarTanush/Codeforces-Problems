s = input()

q_before = 0
q_after = s.count('Q')
ans = 0

for ch in s:
    if ch == 'Q':
        q_before += 1
        q_after -= 1
    elif ch == 'A':
        ans += q_before * q_after

print(ans)