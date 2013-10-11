from decimal import *

A = 42
getcontext().prec = A

def max_pattern(x):
	j = 0
	for i in range(1, len(x)//2):
		#print(x[0:i],x[i:2*i])
		if x[0:i] == x[i:2*i]:
			j = i
	return x[0:j]

for i in range(1, 10):
	s = str(Decimal(1)/Decimal(i))[2:]
	s += "0"*(A-len(s))
	print(max_pattern(s))
