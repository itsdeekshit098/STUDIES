#To find largest among three numbers, input by user.

fn=int(input("enter the first number"))
sn=int(input("enter the second number"))
tn=int(input("enter the third number"))
if(fn>sn and fn>tn):
    print(fn," is greater of ",sn," and ",tn)
if(sn>fn and sn>tn):
    print(sn," is greater of ",fn," and ",tn)
if(tn>fn and tn>sn):
    print(tn,"is greater of ",fn, " and ",sn)
