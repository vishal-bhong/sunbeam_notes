#!/bin/bash

# ----------------------------------
#	Aim : find maximum of two numbers 
# ----------------------------------

# Decision control structure
# if [ condition ]
# then
#	...
# fi

# if [ condition ]
# then
#	...
# else
#	...
# fi

# if [ condition ]
# then
#	...
# elif [ condition ]
# then
#	...
# else
#	...
# fi

# Relational operator
#	-eq, -ne, -lt, -gt, -le, -ge


echo -n "Enter two numbers : "
read num1 num2

max=0

if [ $num1 -eq $num2 ]
then
	echo "num1 and num2 are equal"
	max=$num1
elif [ $num1 -lt $num2 ]
then
	echo "num2 is maximum"
	max=$num2
else
	echo "num1 is maximum"
	max=$num1
fi

echo "Maximum value : $max"
























