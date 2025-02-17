#!/bin/bash

# ----------------------------------
#	Aim : Package installation script
# ----------------------------------

pkgs=("vim" "git" "gcc" "ncal" "rename")

echo "Updating package list !!!"
sudo apt-get update
if [ $? -ne 0 ]
then
	echo "apt-get update is failed ???"
	exit
fi
echo "Package list is updated successfully !!!"


for pkg in ${pkgs[*]}
do
	echo "Installing package : $pkg"
	sudo apt-get install $pkg
	if [ $? -ne 0 ]
	then
		echo "$pkg is not installed"
		continue
	fi
	echo "$pkg is installed successfully"
done



















