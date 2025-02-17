#!/bin/bash

# ----------------------------------
#	Aim : Find area of circle
# ----------------------------------

echo -n "Enter radius of circle : "
read rad

area=`echo "3.142 * $rad * $rad" | bc`

echo "area of circle = $area"





















