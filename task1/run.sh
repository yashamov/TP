#!/bin/bash
array=$(find $REQUIRED -name "*.$EXTENSION")
mkdir $DIR
for var in $ARRAY
do
cp --parents $var $FileFormat
done
tar -czf $ArchiveName $DIR
echo done
