"""
Python program to find factorial, and Fibonacci of a number, received
by user, with iterative as well as recursive process.
"""
# using iterative to find a factorial of a number
n=int(input("enter the numeber whose factorial u need to find"))
fact=1
for i in range(1,n+1):
    fact=fact*i
print("factorial of ",n,"is ",fact)


