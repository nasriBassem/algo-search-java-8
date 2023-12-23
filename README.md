# Linear Search

Linear search, also known as sequential search, is a straightforward search algorithm that finds the position of a target value within a list or array by checking each element in order. The basic idea behind linear search is to iterate through the elements of the list or array one by one until the desired value is found or the end of the list is reached. 

Here's a step-by-step explanation of how linear search works: 
#Start at the Beginning: Begin the search at the first element of the list. 
#Compare: Compare the current element with the target value. 
If the current element is equal to the target value, the search is successful, and the index of the current element is returned. 
If the current element is not equal to the target value, move on to the next element in the list. 
#Repeat: Repeat the comparison process until the target value is found, or all elements in the list have been checked. 
Search Outcome: If the target value is found, return the index of the element containing the target value; otherwise, return a signal indicating that the target value is not present in the list. 

Linear search has a time complexity of O(n), where n is the number of elements in the list. This means that the time it takes to perform a linear search is directly proportional to the size of the input. While linear search is simple and easy to implement, it may not be the most efficient algorithm for large datasets compared to more advanced algorithms like binary search (for sorted lists) or hash-based searches. 
