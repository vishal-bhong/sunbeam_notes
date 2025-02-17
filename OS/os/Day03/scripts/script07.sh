#!/bin/bash

# ----------------------------------
#	Aim : Implement basic calculator
# ----------------------------------

# selection control structure

# case $choice in
#	1|4|Add)
#		...
#		;;
#	2)
#		...
#		;;
#	*)
#		...
#		;;
# esac

echo "1. Add"
echo "2. Sub"
echo "3. Div"
echo "4. Mul"
echo -n "Enter your choice : "
read choice

echo -n "Enter two operands : "
read op1 op2

case $choice in
	1)
		echo `expr $op1 + $op2`
		;;

	2)
		echo `expr $op1 - $op2`
		;;

	3)
		echo `expr $op1 / $op2`
		;;

	4)
		echo `expr $op1 \* $op2`
		;;
	
	*)
		echo "Invalid operation"
		;;
esac


























