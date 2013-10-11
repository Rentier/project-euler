import re

def char_val(s):
	res = 0
	for c in s:
		res += ord(c) - ord('A') + 1
	return res

s = ""

with open('names.txt', 'r') as f:
	s = f.read()

s = re.sub('"| ', '', s)
data = sorted(s.split(','))

res = 0
for i, s in enumerate(data):
	res += (i+1)*char_val(s)
	if s == "COLIN":
		print((i+1)*char_val(s))
#	print(i+1, s)

print(res)





