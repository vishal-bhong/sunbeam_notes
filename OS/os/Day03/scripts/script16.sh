#!/bin/bash

# ----------------------------------
#	Aim : Take filename from user and check for execute permission
# ----------------------------------

# Logical operators
#	-a, -o, !

echo -n "Enter filename : "
read filename

if [ -f $filename -a -x $filename ]
then
	echo "$filename is e regular file with execute permission"
else
	echo "$filename don't have execute permissions"
fi





















