### **Insertion Sort Overview**

- **Definition**:  
  Insertion Sort is a comparison-based sorting algorithm that builds the sorted portion of the array one element at a time by repeatedly picking the next element and inserting it into the correct position within the sorted portion.

---

### **Time Complexity**

1. **Best Case (Already Sorted)**:  
   \( O(N) \)  
   - Only one comparison per element is needed.

2. **Worst Case (Reverse Sorted)**:  
   \( O(N^2) \)  
   - Every element needs to be compared and shifted.

3. **Average Case**:  
   \( O(N^2) \)  
   - Based on the number of comparisons and shifts for random order.

---

### **Space Complexity**

- \( O(1) \):  
   - Insertion Sort is an in-place sorting algorithm, requiring no extra memory.

---

### **Key Characteristics**

1. **Stable Sorting Algorithm**:  
   - Maintains the relative order of equal elements (e.g., two `5`s remain in the same order as in the input).

2. **Efficient for Small or Nearly Sorted Arrays**:  
   - Performs well when the array is small or already mostly sorted.

3. **Adaptive**:  
   - It adapts to the input by reducing the number of comparisons when the array is partially sorted.

---

### **When to Use Insertion Sort**

1. **Small Datasets**:  
   - Performs efficiently on small arrays.

2. **Nearly Sorted Data**:  
   - Very efficient when the array is nearly sorted as it minimizes shifts.

3. **Learning and Conceptual Clarity**:  
   - Often used to introduce sorting algorithms due to its straightforward mechanism.

---

### **Summary**

- **Advantages**:
  - Simple to understand and implement.
  - Efficient for small or nearly sorted datasets.
  - Stable and in-place.

- **Disadvantages**:
  - Inefficient for large, highly unsorted datasets.

- **When to Use**:
  - Small datasets, nearly sorted arrays, or as a foundation for more advanced sorting algorithms.