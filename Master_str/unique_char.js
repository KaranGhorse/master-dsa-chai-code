
function firstUniqueCharacter(s) {
  if (!s) return "";

  const freq = {};

  for (const ch of s) {
    freq[ch] = (freq[ch] || 0) + 1;
  }
  for (const ch of s) {
    if (freq[ch] === 1) return ch;
  }

  return "";
}

console.log(firstUniqueCharacter("leetcode"))