#!/bin/sh

cd `dirname $0`
mvn install
for cls in Sort01AnonClass Sort02FirstLambda Sort03NoTypes Sort04SlimmestLambda Sort05MethodReference ; do
    echo "--- $cls ---"
    java -cp target/classes java8fp.$cls hello 123 world 45 6789
done
    