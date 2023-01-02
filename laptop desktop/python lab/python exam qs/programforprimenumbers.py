x = int(input("hasni\n"))
print("entered number is", x)
print(type(x))
k = 0
for i in range(1, x+1):
    if(x % i == 0):
        k = k+1
        print(k)
if(k <= 2):
    print("entered number is prime number")
else:
    print("entered number is not a prime number")
