function groupAnagrams(strs) {
    const map = {};
    
    for (let str of strs) {
      const sorted = str.split('').sort().join('');
      if (!map[sorted]) {
        map[sorted] = [];
      }
      map[sorted].push(str);
    }
    
    return Object.values(map);
  }
  
  console.log(groupAnagrams(["eat", "tea", "tan", "ate", "nat", "bat"]));
  