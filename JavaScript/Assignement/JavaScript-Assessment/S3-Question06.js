// Bubble Sort Program


function bubbleSort(arr) {
    const length = arr.length;
    for (let i = 0; i < length - 1; i++) {
      for (let j = 0; j < length - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          // Swap elements
          const temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
    return arr;s
  }
  
  const data = [6, 4, 0, 3, -2, 1];
  const sortedData = bubbleSort(data);
  console.log(sortedData);
  
   