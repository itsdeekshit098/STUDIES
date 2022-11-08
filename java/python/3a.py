'''
. Write python programs
a. To print all prime number in a series(series in b/w range)
b. To find largest among three numbers, input by user.
c. To find HCF for two numbers, input by user
'''
#program to To print all prime number in a series(series in the sense b/w a particualar range)

x=int(input("enter a number from where u want to start"))
y=int(input("enter a number where u want to stop"))
count=0
#prime number in the sense having only 2 number as exact divisor i.e. 1 and itself can divide that number
for i in range(x,y):
    for j in range(1,i+1):
        if(i%j==0):
            count=count+1
    if(count==2):
        print(i,end=",")
    count=0
    

    

