#!/bin/bash

# ----------------------------------
#	Aim : File conditionals
# ----------------------------------

#	-e $path	:	true if path exist
#	-f $file	:	true if file is regular file
#	-d $file	:	true if file is directory
#	-r $file	:	true if file has read permissions
#	-w $file	:	true if file has write permissions
#	-x $file	:	true if file has execute permissions

fcount=0

for var in `ls`
do
	if [ -f $var ]
	then
		fcount=`expr $fcount + 1`
	fi
done

echo "File count = $fcount"



















