#!/bin/bash

# ----------------------------------
#	Aim : Print Table of given number 
# ----------------------------------

# init
# while [ condition ]
# do
#	body
#	mod
# done

# init
# until [ condition ]
# do
#	body
#	mod
# done

echo -n "Enter  number : "
read num

echo "Table of $num : "

i=1								# init
# while [ $i -lt 11 ]				# cond
until [ $i -eq 11 ]				# cond
do
	echo `expr $num \* $i` 		# body
	i=`expr $i + 1`				# mod
done





















