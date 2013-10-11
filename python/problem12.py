
n = 1
s = 0
while True:

	divider = 2	# One and itself
	for i in range(2, s):
		if s % i == 0:
			divider += 1

	if divider >= 500:
		print(s)
		break

	print(s)
	s += n
	n += 1
