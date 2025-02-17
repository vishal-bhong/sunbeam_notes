#!/bin/bash

# ----------------------------------
#	Aim : Find area of rectangle 
# ----------------------------------

echo -n "Enter length and breadth of rectangle : "
read le br

# command substitution
#	- substituting result of command in place of that command
#	- this is donee by two ways
#		- `command`
#		- $(command)

area=`expr $le \* $br`
echo "Area of rectangle : $area"



















