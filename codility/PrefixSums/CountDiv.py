''''
Write a function:
def solution(A, B, K)
that, given three integers A, B and K, returns the number of integers within the range [A..B] that are divisible by K, i.e.:
{ i : A ? i ? B, i mod K = 0 }
For example, for A = 6, B = 11 and K = 2, your function should return 3, because there are three numbers divisible by 2 within the range [6..11], namely 6, 8 and 10.
Assume that:
A and B are integers within the range [0..2,000,000,000];
K is an integer within the range [1..2,000,000,000];
A ? B.
Complexity:
expected worst-case time complexity is O(1);
expected worst-case space complexity is O(1).
'''


def solution(A, B, K):
  if(B < K):
      return 0
  value_1 = int(A/K)
  if A%K != 0:
      value_1 += 1
  value_2 = int(B/K)
  return value_2 - value_1

A = 10
B = 20
K = 5

print(solution(A, B, K))