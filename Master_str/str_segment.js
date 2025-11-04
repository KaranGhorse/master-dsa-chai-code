
function strSegments(s="Welcome   to   the  MasterJI   platform!") {
    let arr = s.trim().split(" ")
    let ans = []
    for (let i = 0; i < arr.length; i++) {
       if (arr[i].length > 0) {
        ans.push(arr[i])
       }  
    }
    return ans.length
}

console.log(strSegments());
