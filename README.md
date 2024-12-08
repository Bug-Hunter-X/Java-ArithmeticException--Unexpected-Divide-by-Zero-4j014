# Java ArithmeticException: Unexpected Divide by Zero

This repository demonstrates an uncommon scenario involving an `ArithmeticException` in Java. While division by zero is a common error, the example highlights a situation where it might occur unexpectedly due to a lack of explicit error handling.

The `UncommonBug.java` file contains the buggy code.  `UncommonBugSolution.java` provides a corrected version.

## Bug Description
The bug arises from the line `int z = x / y;` where `y` is 0, leading to an `ArithmeticException`.  The unusual aspect is the absence of a `try-catch` block for better error handling.

## Solution
The solution involves wrapping the division operation in a `try-catch` block to handle the potential exception gracefully.  This prevents the program from crashing and allows for more robust error management.