function longestCommonSubstring(strings) {
  if (!arr.length) return "";
  let s = arr.reduce((a, b) => a.length < b.length ? a : b);
  let res = "";
  for (let i = 0; i < s.length; i++)
    for (let j = i + 1; j <= s.length; j++) {
      const sub = s.slice(i, j);
      if (arr.every(x => x.includes(sub)) && sub.length > res.length)
        res = sub;
    }
  return res;
}


const arr = ["windtalker", "windy", "wind"];
console.log(longestCommonSubstring(arr)); 


