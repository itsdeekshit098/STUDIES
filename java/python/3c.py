#c. To find HCF for two numbers, input by user
'''
logic:
If we were given two numbers, then

First, divide the large number by a small number.
If the remainder is left, then divide the first divisor by remainder.
If the remainder divides the first divisor completely, then it is the HCF or highest common factor of the given two numbers.
If the remainder does not divide the first divisor completely, then repeat the steps.
'''

x=int(input("enter 1st number"))
y=int(input("enter 2nd number"))
if(x>y):
    g=x
    l=y
else:
    g=y
    l=x
def int1(g,l):
    q=g%l
    if(q==0):
        print(l,"is the HCF")
    else:
        int1(l,q)
int1(g,l)




