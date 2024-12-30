### **Selection Sort Overview**

- **Definition**:  
  Selection Sort is a comparison-based sorting algorithm that divides the array into two parts: a sorted portion and an unsorted portion. It repeatedly selects the smallest (or largest, for descending order) element from the unsorted portion and swaps it with the first element of the unsorted portion.

---

### **Time Complexity**

1. **Best Case**:  
   \( O(N^2) \)  
   - Even if the array is already sorted, the algorithm still performs \( N^2 \) comparisons.

2. **Worst Case**:  
   \( O(N^2) \)  
   - The algorithm always compares all elements in the unsorted portion.

3. **Average Case**:  
   \( O(N^2) \)  
   - Regardless of the input order, \( N^2 \) comparisons are made.

---

### **Space Complexity**

- \( O(1) \):  
   - Selection Sort is an in-place algorithm, requiring no extra memory.

---

### **Key Characteristics**

1. **Simple but Inefficient**:  
   - Easy to implement but inefficient for large datasets due to its \( O(N^2) \) time complexity.

2. **Not Adaptive**:  
   - It does not take advantage of partially sorted arrays.

3. **Stable or Unstable**:  
   - **By default**: Unstable (elements with equal values might not retain their original relative order).  
   - **Modified**: Can be made stable by avoiding unnecessary swaps.

---

### **When to Use Selection Sort**

1. **Small Datasets**:  
   - Works well for small arrays where simplicity is more important than efficiency.

2. **When Memory Is Limited**:  
   - Since it is in-place, it’s suitable when space efficiency is critical.

3. **Need for Simplicity**:  
   - Best used when you require a simple and straightforward sorting algorithm.

---

### **Advantages and Disadvantages**

**Advantages**:
- Simple to understand and implement.
- In-place sorting requires no additional memory.

**Disadvantages**:
- Inefficient for large datasets due to \( O(N^2) \) time complexity.
- Always performs \( N^2 \) comparisons, regardless of input order.
- Not adaptive to sorted or partially sorted data.

---

### **Summary**

- **Advantages**:  
  - Easy to implement, requires no extra space.

- **Disadvantages**:  
  - Inefficient for large datasets, not adaptive to sorted arrays.

- **When to Use**:  
  - Suitable for small datasets or scenarios where memory is constrained and simplicity is sufficient.