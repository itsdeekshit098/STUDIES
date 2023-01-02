#u need to use "try" at starting itself ie for whole code which need to runned and "expect" at ending 
try:
    k = input("enter a number\n")
    k = int(k)
    if type(k) == int:
        if k > 10:
            print("greater than 10")
        elif k < 10:
            print("lesser than 10")
except:
    print("the value u enter is not a number")
