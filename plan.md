## TODO:

# Add method:
 adds to the array, need to figure out how to add to end of the tree and then bubble up after adding depending on value. will need to look at the formula for finding the realtive child and/or parent. ((i*2)+1) etc..

# Pop method:
Removes from the first value of array, the last value or most bottom left value is now the front value or root. then sift down to correct spot using index formulas

# Peek method
looks at the first or root value without removing from the array. maybe make a copy of the value and referernce it

# Check the size method
returns length of the array. can't use the .size or length i believe so a simple loop through the array using a int count to get array length

# Empty method 
check to see if the array is empty. maybe another simple loop and if the the count is zero then the array is empty.

# Quit
looks like the app runs on a while loop. so either a break or a boolean to leave the loop

# Add getHeap method
provides access to the heap's internal structure for JUnit testing.

# Junit tests
test each method thoroughly

# Private variables
heap - backed by an arraylist