'''b. Python program to find factorial, and Fibonacci of a number, received
by user, with iterative as well as recursive process.'''

#fibonacci series using iterative
n=int(input("enter a number"))
firstterm=0
secondterm=1
for i in range(1,n+1):
    print(firstterm)
    newterm=firstterm+secondterm
    firstterm=secondterm
    secondterm=newterm