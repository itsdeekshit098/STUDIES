x = 0
y = 1
z = int(input("enter how many no of  fibonacci series numbers u want to print"))
for i in range(z):
    print(x)
    result = x+y
    x = y
    y = result
