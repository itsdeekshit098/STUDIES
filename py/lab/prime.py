'''To print all prime number in a series (between the lower and upper
limits)'''


first_number=int(input("enter the first number"))
second_number=int(input("enter the second number"))
no_of_divisors=0;
for i in range(first_number,second_number):
    for j in range(1,i+1):
        if(i%j==0):
            no_of_divisors=no_of_divisors+1;
    if(no_of_divisors==2):
        print(i)
    no_of_divisors=0

    
