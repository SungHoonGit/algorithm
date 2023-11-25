import sys
##import collections
input = sys.stdin.readline

t = int(input())

for i in range(t):
    a = input().rstrip()
##  s = collections.deque()
    cnt = 0
    flag = 1

    for x in a:
        if x == '(':
            cnt += 1
        else:
            if cnt > 0:
                cnt -= 1
            else:
                flag = 0
                break

    if flag == 1 and cnt == 0:
        print('YES')
    else:
        print('NO')
