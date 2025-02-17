#!/bin/bash

# ----------------------------------
#	Aim : String
# ----------------------------------

# -z $str - true if str is empty
# =, !=

str=sunbeam
if [ -z $str ]
then
	echo "str is empty"
else
	echo "str is not empty"
fi

str1=sunbeam
str2=pune

str=$str1$str2
echo "str = $str"

if [ $str1 = $str2 ]
then
	echo "str1 and str2 are equal"
else
	echo "str1 and str2 are not equal"
fi


















