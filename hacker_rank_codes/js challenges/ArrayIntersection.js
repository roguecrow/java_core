function intersection(arr1, arr2) {
    return arr1.filter(value => arr2.includes(value));
  }
  
  console.log(intersection([1, 2, 3, 4], [3, 4, 5, 6])); // Output: [3, 4]
  