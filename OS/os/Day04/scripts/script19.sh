#!/bin/bash

# ----------------------------------
#	Aim : Function
# ----------------------------------

# to create a function , use "function" keyword
#	eg	function fun
# if "function" keyword is not used then give "()" after function name
#	eg	fun()
# define body of function in "{}"

function print_msg
{
	echo "This is our first function"
	echo "print_msg()"
}

function print_number
{
	#	$1, $2, $3, ...	 - function arguments are accessed like this
	echo "number = $1"
}

addition()
{
	# $num1 --> $1
	# #num2 --> $2
	res=`expr $1 + $2`
	echo $res
}

echo "main script"
print_msg

print_number 10

num1=10
num2=20

sum=`addition $num1 $num2`
echo "$num1 + $num2 = $sum"















