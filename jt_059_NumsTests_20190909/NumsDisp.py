#! /usr/bin/env python3

num = 123.998877665544332211
exp = 1e6

def dispn(mynum, myexp):
    newn = int(mynum * myexp) / myexp
    return newn

print("Original number = {}".format(num))

for i in range(1, 19):
    exp2 = 10**i
    print("exp: " + str(exp2) + "; " + str(dispn(num, exp2)))

