# Count the Segments in a String

Given a string s, return the number of segments in the string.

A segment is defined to be a contiguous sequence of non-space characters.

### Example 1:

```
Input: s = "Hello, MasterJI users!"
Output: 3
Explanation: The three segments are "Hello,", "MasterJI", and "users!".
```


### Example 2:
```
Input: s = "   Welcome   to   the  MasterJI   platform!  "
Output: 5
Explanation: The three segments are "Welcome", "to", "the" , "MasterJI" and "platform!".
```
### Example 3:
```
Input: s = ""
Output: 0
Explanation: There are no segments as the string is empty.
Your task is to analyze the given string s, identify contiguous sequences of non-space characters, and return their count.
```

### Constraints
The input string s may contain spaces, letters, and punctuation characters.

The length of the string s is between 0 and 10^4.