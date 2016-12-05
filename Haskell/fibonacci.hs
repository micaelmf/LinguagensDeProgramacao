fib::Int -> Int
fib 0 = 0
fib 1 = 1 
fib n = fib(n-1) + fib(n-2)


fib2::Int -> Int
	| 0 = 0
	| 1 = 1
	| otherwise n = fib2(n-1) + fib2(n-2)