fact=1
num=int(input("enter the number"))
def fact(num):
    sum=num
    if(num>1):
        sum=sum*fact(sum-1)
        return sum
    else:
        return 1
print(fact(num))