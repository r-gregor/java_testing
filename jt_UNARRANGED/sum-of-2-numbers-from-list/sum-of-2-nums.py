#! /usr/bin/env python3

nums = [-18, -12, -10, -6, -4, -2, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]

i = 0
j = len(nums) - 1
sum = 8

print("Sorted list: {}".format(nums))
print("Pairs of numbers from the list that make the sum of {}:".format(sum))

while i < j:
    mysum = nums[i] + nums[j]
    if mysum == sum:
        print((nums[i], nums[j]))
        i = i + 1
        continue
    elif mysum > sum:
        j = j - 1
    else:
        i = i + 1
