# Array Syntax in Python
# array_name = [item1, item2, item3, ... ]

# Question
# Given an array A of size N, print the reverse of it.

arr = ["Lipa", "Dua", "is", "name", "My"]

print("The given array is : ", arr)

# Using the slicing technique
rev_arr = arr[::-1]

# Using the reverse() function provided by python library
arr.reverse()


print("Reverse of the given array is : ", rev_arr)