'''
5.Write python program to elaborate strings such as
a. String declaration, traversing, slicing, concatenating, and sorting in a
list.
b. To check whether a string is palindrome or not; to remove
punctuations from a string.
'''

#1))))))))))))))))
#String declaration
a="hansi"
print(a)
a='hansi2'
print(a)
a='''hansi3'''
print(a)
#using triple quotations we can declare a mulitple lines string
a='''dfffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffsdddd'''
print(a)



#2))))))))))))))))))))))))))))))))))))
#string traversing(calling each element or going through each element)
a="hansi"
print(a)
for i in a:
    print(i)




#3)))))))))))))))))))))))
#string slicing
print(a[:])
print(a[0:])
print(a[:5])
print(a[1:])
print(a[:4])
print(a[1:4])
print(a[::-1])#see reverse indexing starts from -1 so here :: denotes to start from reverse and 
print(a[-5:-1])#see if u use to give a[-1:-5] it prints nothing 
#print(a[::-4]) 

#4)))))))))))))))))))))))))
#concatenating a string
a="han"
b="si"
c=a+b
print("concatenated string== ",c)





'''
_________________________________ Strings are immutable. This means that elements of a string cannot be changed once
it has been assigned. We can simply reassign different strings to the same name.
We cannot delete or remove characters from a string. But deleting the string entirely
is possible using the keyword ‘del’.
 ___________________________________
str1 = 'Hello'
str2 ='World!'
# using +
print('str1 + str2 = ', str1 + str2)
# using *
print('str1 * 3 =', str1 * 3)
 _______________________________________________ Writing two string literals together also concatenates them like + operator.
If we want to concatenate strings in different lines, we can use parentheses. ____________________________________________________
# two string literals together
'Hello ''World!'
'Hello World!'
# using parentheses
s = ('Hello '
 'World')
s
'Hello World'
 __________________
'''
s = ('Hello''World')
print(s)