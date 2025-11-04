# Unique Character Finder

Given a string, find the first character that does not repeat anywhere in that string.

Your task is to identify which character is the first to be unique, even if there are other characters that appear multiple times later in the string. You need to scan through the string, keep track of the frequency of each character, and identify the first one that has a frequency of exactly one.

### Examples:
#### Example 1:

```
Input: s = "swiss"
Output: 'w'
Explanation: The first unique character is 'w', as it does not have any other occurrences.
```

#### Example 2:

```
Input: s = "character"
Output: 'h'
Explanation: The first unique character is 'h', while 'c' and 'r' both appear more than once.
```

#### Example 3:
```
Input: s = "masterpiece"
Output: 'm'
Explanation: The first unique character is 'm'.
```

### Constraints
- 1 <= length of string <= 10^5

- Input string consists of English letters (both uppercase and lowercase).