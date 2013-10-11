def memoize(f):
    cache = {}
    def decorated_function(*args):
        if args in cache:
            return cache[args]
        else:
            cache[args] = f(*args)
            return cache[args]
    return decorated_function

@memoize
def fib(n):
    return n if n < 2 else fib(n-2) + fib(n-1)

x = 0
while True:
    f = fib(x)
    l = len(str(f))

    if l >= 1000:
        print(x)
        break

    x+=1
