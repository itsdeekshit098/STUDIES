'''
6. Write python program
    a. To elaborate lists with the operations such as creating, navigating,
    slicing, adding or removing elements, etc.
    b. To elaborate tuples with the operations as in above assignment.
'''

'''creating a list'''
  #empty list
a=[]
print(a)
#list with values
b=['a','b','c']
print(b)
#list in a list
c=[b,'d']
print(c)

'''navigating in a list'''

h=['a','b','c','d']
print(h[1])
print(h[-1])

'''slicing a list'''

print(h[:])
print(h[:4])
print(h[:3])
print(h[0:])
print(h[2:4])
print(h[::-1])#prints elements of list in reverse order

'''adding elements'''

b=['1','b','c']
b.append('h')
print(b)
#changing values
b[1]="t"
print(b)

'''deleting an element in alist'''

i=['a','b','c','d']
del(i[1])
print(i)





