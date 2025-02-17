#!/bin/bash

# ----------------------------------
#	Aim : Arrays
# ----------------------------------

#	arr=(10 20 30 40 50)
#	declare -a arr
#	${arr[*]}	-	all the elements of array	-	"10 20 30 40 50"
#	${arr[@]}	-	all the elements of array	-	"10" "20" "30" "40" "50"
#	${#arr[*]}	-	length of the array
#	${#arr[@]}	-	length of the array
#	${arr[$i]}	-	ith element of the array
#	${#arr[$i]}	-	length of ith element of the array
#	${arr[*]:n}	-	all elements from nth index
#	${arr[*]:n:m}	-	m elements from nth index

arr=(10 20 30 40 50)

echo "arr : ${arr[*]}"
echo "arr : ${arr[@]}"

echo "length : ${#arr[*]}"
echo "length : ${#arr[@]}"

echo "2nd index onwards : ${arr[*]:2}"
echo "1st index onwards 2 elements : ${arr[*]:1:2}"















