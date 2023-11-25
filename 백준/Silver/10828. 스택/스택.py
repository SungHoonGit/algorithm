import sys
import collections
input = sys.stdin.readline

n = int(input())
s = collections.deque()

for i in range(n):
    a = input().rstrip()
    
    if a == 'pop':
        if len(s) == 0:
            print(-1)
        else:
            print(s[-1])
            s.pop()
    elif a == 'size':
        print(len(s))
    elif a == 'empty':
        if len(s) == 0:
            print(1)
        else:
            print(0)
    elif a == 'top':
        if len(s) == 0:
            print(-1)
        else:
            print(s[-1])
    else:
        a, x = a.split()
        s.append(int(x))
