#!/bin/bash

# ----------------------------------
#	Aim : Take path from user and check exist or not and also check whether it is of regular file or directory
# ----------------------------------

echo -n "Enter path : "
read path

if [ -e $path ]
then
	echo "$path is exists"
	if [ -f $path ]
	then
		echo "$path is regular file"
	elif [ -d $path ]
	then 
		echo "$path is directory"
	fi

else
	echo "$path doesn't exists"
fi















