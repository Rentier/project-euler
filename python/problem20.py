from math import factorial

s = factorial(100)
print(s)

res = 0
for c in str(s):
	res += int(c)

print(res)
