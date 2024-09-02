function longestWord(str) {
    const words = str.split(' ');
    let maxLength = 0;
    let longest = '';
  
    words.forEach(word => {
      if (word.length > maxLength) {
        maxLength = word.length;
        longest = word;
      }
    });
  
    return longest;
  }
  
  console.log(longestWord("The quick brown fox jumped over the lazy dog")); 
  