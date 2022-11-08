#using recusive functions function to find the factorial of a number
def fact(n):
    if(n>=1):
        fact1=n*fact(n-1)
    else:
        fact1=1 #or else u can make use of return 1 so when n<1 1 will be returned to the function
    return fact1
print(fact(6))
