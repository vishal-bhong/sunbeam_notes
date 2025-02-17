#!/bin/bash

# ----------------------------------
#	Aim : Print Table of given number 
# ----------------------------------

# for(( init ; cond ; mod ))
# do
#	...
# done

# for var in [collection]
# do
#	...
# done


echo -n "Enter  number : "
read num

echo "Table of $num : "

# for(( i=0 ; i<= 10 ; i++ ))
# for i in 1 2 3 4 5 6 7 8 9 10
for i in `seq 10`
do
	echo `expr $num \* $i` 		# body
done





















