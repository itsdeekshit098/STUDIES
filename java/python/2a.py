'''
Write programs to implement conditional operations on following:
a. Python program to find the sum and average of natural numbers up to
n where n is provided by user
'''
n=int(input("enter a number"))
sum=0
for i in range(1,n+1):
    sum=sum+i

print("sum of n numbers is ",sum)#u cant use + bcz concatenation of only strings is done
average=sum//n
print("sum of n numbers is ",average)

'''sum of n numbers using recursice concept'''
'''
def tri_recursion(k):
  if(k > 0):
    result = k + tri_recursion(k - 1)
   
  else:
    result = 0
  return result

print(tri_recursion(6))
'''