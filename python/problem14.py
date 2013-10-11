import sys


def rec(n, c=0):
	if n == 1: return c+1
	elif n % 2 == 0: return rec(n/2, c+1)
	else: return rec(3*n + 1, c+1)

foo = (0, 0)	# (Start number, chain length)

for i in range(1, 1000000):
	cur = rec(i)
	if cur > foo[1]:
		foo = (i, cur)
	print(i)

print(foo)
# (837799, 525)
