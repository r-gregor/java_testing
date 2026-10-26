#! /usr/bin/env python3
# -*- coding: utf-8 -*-

import os, sys
import datetime as dt
from pathlib import Path

# timestamp
def tms():
    return dt.datetime.now().strftime('%Y%m%d_%H%M%S')

# MESSAGE:
print("[ {} ] -- Starting {} ...".format(tms(), sys.argv[0]))

# USAGE
usage = "[ {} ] -- USAGE: {} [topdir1] [topdir2]\n".format(tms(), sys.argv[0])


if len(sys.argv) != 3:
    print(usage)
    sys.exit(1)

# vars
tdy = dt.datetime.now().strftime('%Y%m%d')
topdir1 = os.path.abspath(sys.argv[1])
topdir2 = os.path.abspath(sys.argv[2])
tmpdir = os.path.abspath("/home/gregor.redelonghi/.tmp")
tmpfilename = "dupfiles_" + tdy + ".txt"
tmpfile = os.path.join(tmpdir, tmpfilename)
tdy = dt.datetime.now().strftime('%Y%m%d')


# FUNCTIONS --------------------------------------------------------------------------------------------------
def make_fpath_map(my_path):
    fnamemap = {}
    '''
    function that returns a dict of filenames as keys
    and coresponding abspath as value
    '''

    for root, dirs, files in os.walk(my_path):
        for name in files:
            full_path = os.path.join(root, name)
            fpath, fname = os.path.dirname(full_path), os.path.basename(full_path)
            fnamemap[fname] = fpath
    return fnamemap

def remove_dups(tmpfjl):
    removables = []
    if os.path.isfile(tmpfjl):
        f = open(tmpfjl, "r")

        for el in f:
            removables.append(el.strip())
        f.close()
        
        print("[ {} ] -- Duplicate files:".format(tms()))
        for ff in removables:
            print(ff)

        print("\n" + "[ {} ] -- Remove?\n".format(tms()))
        
        
        '''
        for ff in removables:
            pth = Path(ff)
            # TEST
            print("[ {} ] -- Removing {}".format(tms(), pth))
        '''
    else:
        print("[ {} ] -- No {} found!".format(tms(), tmpfjl))
        sys.exit(1)


def get_dups(dict1, dict2):
    outdict = {}
    for fname1 in dict1:
        if fname1 in dict2:
            outdict[fname1] = dict2[fname1]
    
    if len(outdict) != 0:
        print("[ {} ] -- Duplicate filenames found! Writing to {}".format(tms(), tmpfile))
        f = open(tmpfile, "w+")
        for k, v in outdict.items():
            f.write(os.path.join(v, k) + "\n")
        f.close()
        
    else:
        print("NO duplicate filenames found!")
        sys.exit(1)




# FUNCTIONS --------------------------------------------------------------------------------------------------


# make first dict
dirs1 = make_fpath_map(topdir1)
dirs2 = make_fpath_map(topdir2)

get_dups(dirs1, dirs2)

remove_dups(tmpfile)



