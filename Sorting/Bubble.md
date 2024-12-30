### **Bubble Sort Overview**

- **Definition**: 
  Bubble Sort is a simple comparison-based sorting algorithm. It repeatedly traverses the array, compares adjacent elements, and swaps them if they are in the wrong order. This process is repeated until the array is sorted.

---

### **Time Complexity**

1. **Best Case (Already Sorted)**:  
   \( O(N) \)  
   - With an optimization to detect if the array is already sorted (using a `swapped` flag).

2. **Worst Case (Reverse Sorted)**:  
   \( O(N^2) \)  
   - Requires maximum swaps and comparisons.

3. **Average Case**:  
   \( O(N^2) \)  
   - Based on the number of comparisons and swaps in an unsorted array.

---

### **Space Complexity**

- \( O(1) \):  
   - Bubble Sort is an in-place sorting algorithm, meaning it requires no extra memory.

---

### **Key Characteristics**

1. **Stable Sorting Algorithm**:  
   - It maintains the relative order of equal elements (e.g., if two `5`s are in the input, they will remain in the same order in the output).

2. **Inefficient for Large Datasets**:  
   - Due to its quadratic time complexity, it is not suitable for large arrays.

3. **Simple to Implement**:  
   - Easy to understand and code.

4. **Optimization Possibility**:  
   - Can detect if the array is already sorted and terminate early.

---

### **When to Use Bubble Sort**

1. **Small Datasets**:  
   - Useful for small arrays where simplicity outweighs efficiency.

2. **Nearly Sorted Data**:  
   - Performs well when the array is already sorted or nearly sorted.

3. **Teaching and Learning**:  
   - Often used in educational settings to introduce basic sorting concepts.

---

### **Summary**

- **Advantages**:
  - Simple and easy to implement.
  - Stable and in-place.
  
- **Disadvantages**:
  - Inefficient for large or highly unsorted datasets.
  
- **When to Use**:
  - For small datasets, nearly sorted arrays, or as a learning tool.