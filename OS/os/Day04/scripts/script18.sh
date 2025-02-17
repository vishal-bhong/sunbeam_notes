#!/bin/bash

# ----------------------------------
#	Aim : Find maximum positional parameter
# ----------------------------------

max=$1

for param in $*
do
	if [ $param -gt $max ]
	then
		max=$param
	fi
done

echo "Max param : $max"



















