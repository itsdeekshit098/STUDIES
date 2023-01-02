a = int(input("no of integers u need sum and find average"))


def sum(a):
    if(a > 1):
        result = a+sum(a-1)
        return result
    if(a == 1):
        result = 1
        return result


print(sum(a))
# for i in range(1,n):
