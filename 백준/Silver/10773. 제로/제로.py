import sys
import collections
# input = sys.stdin.readline  # 파일로 실행할 때 주석 처리

n = int(input())
s = collections.deque()

for i in range(n):
    a = input().rstrip()
    
    if a == '0':
        if len(s) > 0:
            s.pop()
    else:
        s.append(int(a))

print(sum(s))
