#!/bin/bash

# ----------------------------------
#	Aim : Find sum and max of array elements
# ----------------------------------

arr=(20 40 30 50 10)

sum=0
i=0
while [ $i -lt ${#arr[*]} ]
do
	sum=`expr $sum + ${arr[$i]}`
	i=`expr $i + 1`
done	

echo "Array sum = $sum"

max=0

for ele in ${arr[@]}
do
	if [ $ele -gt $max ]
	then
		max=$ele
	fi
done

echo "Array max = $max"

















