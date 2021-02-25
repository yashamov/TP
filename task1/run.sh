#!/bin/bash
array=$(find $1 -name "*.$2")
mkdir $3
for var in $array
do
cp --parents $var $3
done
tar -czf $4 $3
echo done
