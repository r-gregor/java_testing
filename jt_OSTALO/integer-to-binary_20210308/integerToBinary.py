#! /usr/bin/env python3


for N in range (1024):
	print("{:<5}".format(N), "{:b}".format(N).zfill(8))
