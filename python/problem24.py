import itertools

A = ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"]

x = [foo for foo in itertools.permutations(A)]
print("".join(x[1000000-1]))
