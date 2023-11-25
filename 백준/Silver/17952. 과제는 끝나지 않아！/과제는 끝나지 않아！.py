import sys
import collections
input = sys.stdin.readline

n = int(input())
s = collections.deque()
res = 0

for i in range(n):
    b = list(map(int, input().split()))

    if b[0] ==0:
        if len(s) == 0:
            continue
        a, t = s.pop()
    else:
        a, t = b[1], b[2]

    if t == 1:
        res += a
    else:
        s.append([a, t -1])

print(res)
