#! /usr/bin/env python3
# file Test2.py

i = 0

for i in range(100001):
    prd = i * 2
    print("Factor " + str(i) + "multiplied by 2: " + str(prd))
    
'''
$> time java Test2 &> /dev/null && time python3 Test2.py &> /dev/null

real    0m0.204s
user    0m0.000s
sys     0m0.031s

real    0m1.521s
user    0m1.497s
sys     0m0.015s

'''
