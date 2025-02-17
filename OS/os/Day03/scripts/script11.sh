#!/bin/bash

# ----------------------------------
#	Aim : select loop
# ----------------------------------

# select var in [collection]
# do
# 	body
# done

select ch in Add Sub Div Mul
do
	echo -n "Enter two operands : "
	read op1 op2 

	case $ch in
		Add)
			echo `expr $op1 + $op2`
			;;
		Sub)
			echo `expr $op1 - $op2`
			;;
		Div)
			echo `expr $op1 / $op2`
			;;
		Mul)
			echo `expr $op1 \* $op2`
			;;
	esac
done



















