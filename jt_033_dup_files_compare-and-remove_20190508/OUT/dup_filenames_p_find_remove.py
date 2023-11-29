#! /usr/bin/env python3
# -*- coding: utf-8 -*-

# V2:    20190507:
#        change os.path module with pathlib.Path and pathlib.PurePath modules
#         SEE: ptn_os-vs-pathlib-module_20190507.txt
#        --> get absolute path: Path("path").resolve()
#         --> get path name: PurePath("path").parent
#         --> get file name: PurePath("path").name
#        --> join path + name: PurePath.joinpath("dir", "filename")


import os, sys
import datetime as dt
from pathlib import Path
from pathlib import PurePath

# timestamp
def tms():
    return dt.datetime.now().strftime('%Y%m%d_%H%M%S')

# MESSAGE:
print("[ {} ] -- Starting {} ...".format(tms(), sys.argv[0]))

# USAGE
usage =     ("[ {} ] -- USAGE:\n" + 
            "\t{} [cmpr_dir] [rmv_dir]\n" +
            "\t\t" + "cmpr_dir - dir to compare\n" + 
            "\t\t" + "rmv_dir - dir to remove from\n").format(tms(), sys.argv[0])


if len(sys.argv) != 3:
    print(usage)
    sys.exit(1)
    


# vars
tdy = dt.datetime.now().strftime('%Y%m%d')
cmpr_dir = Path(sys.argv[1]).resolve()
rmv_dir = Path(sys.argv[2]).resolve()
tmpdir = Path("/home/gregor.redelonghi/.tmp").resolve()
tmpfilename = "dupfiles_" + tdy + ".txt"
tmpfile = Path.joinpath(tmpdir, tmpfilename)
tdy = dt.datetime.now().strftime('%Y%m%d')

for dirn in [cmpr_dir, rmv_dir]:
    if not dirn.exists():
        print("[ {} ] -- Directory {} NOT found!".format(tms(), dirn))
        sys.exit(1)

# TEST # TEST # TEST # TEST # TEST # TEST # TEST # TEST # TEST # TEST # TEST # TEST # TEST # TEST # TEST
testtmpf = tmpdir.joinpath("KRENTEST.txt")
testtmpf.touch(exist_ok = True)


# FUNCTIONS # FUNCTIONS # FUNCTIONS # FUNCTIONS # FUNCTIONS # FUNCTIONS # FUNCTIONS # FUNCTIONS # FUNCTIONS
def make_fpath_map(my_path):
    fnamemap = {}
    '''
    function that returns a dict of filenames as keys
    and coresponding abspaths as values
    '''

    for root, dirs, files in os.walk(my_path):
        for name in files:
            full_path = Path(root).joinpath(name)
            fpath, fname = full_path.parent, full_path.name
            fnamemap[fname] = fpath
    return fnamemap


def remove_dups():
    removables = []
    tmpfjl = tmpfile
    if Path(tmpfjl).is_file:
        f = open(tmpfjl, "r")

        for el in f:
            removables.append(el.strip())
        f.close()
        
        print("[ {} ] -- Duplicate files:".format(tms()))
        for ff in removables:
            print(ff)

        print("\n" + "[ {} ] -- Remove files?".format(tms()))
        
        # TODO: yes/no, remove/quit
        # TEST
        print("[ {} ] -- TEST ...\n".format(tms()))

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
            f.write( str(Path.joinpath(v, k)) + "\n")
        f.close()
        return True
    
    else:
        print("NO duplicate filenames found!")
        return False
        sys.exit(1)


def remove_tmp_fjl(tempf):
    if tempf.exists():
        print("[ {} ] -- Removing {}".format(tms(), tempf))
        tempf.unlink()


def dupfiles_find_remove(cmprd, rmvd):
    dirs1 = make_fpath_map(cmprd)
    dirs2 = make_fpath_map(rmvd)

    if get_dups(dirs1, dirs2):
        remove_dups()
        remove_tmp_fjl(testtmpf)


# FUNCTIONS # FUNCTIONS # FUNCTIONS # FUNCTIONS # FUNCTIONS # FUNCTIONS # FUNCTIONS # FUNCTIONS # FUNCTIONS


# MAIN
if __name__ == "__main__":
    dupfiles_find_remove(cmpr_dir, rmv_dir)




