### **Linear Search Overview**

- **Definition**:  
  Linear Search is a simple algorithm that traverses an array sequentially to find the target element. It compares each element with the target until a match is found or the end of the array is reached.

---

### **Time Complexity**

1. **Best Case**:  
   \( O(1) \)  
   - The target is found at the first position.

2. **Worst Case**:  
   \( O(N) \)  
   - The target is at the last position or not present in the array.

3. **Average Case**:  
   \( O(N) \)  
   - On average, half the array needs to be traversed.

---

### **Space Complexity**

- \( O(1) \):  
   - Linear Search is an in-place algorithm and requires no extra memory.

---

### **Key Characteristics**

1. **Unsorted Data**:  
   - Linear Search can be used on both sorted and unsorted arrays.

2. **Iterative**:  
   - Traverses the array element by element.

3. **Simplest Search Algorithm**:  
   - Easy to implement and understand, but inefficient for large datasets.

4. **Works for Any Collection**:  
   - Can be used with arrays, lists, or any collection that allows sequential access.

---

### **When to Use Linear Search**

1. **Small Datasets**:  
   - Efficient for small arrays where simplicity is more important than speed.

2. **Unsorted Data**:  
   - Best choice when the data is unsorted or unsortable.

3. **Rare Searches**:  
   - Suitable for occasional searches where the overhead of sorting or indexing is not justified.

---

### **Advantages and Disadvantages**

**Advantages**:
- Works on unsorted data.
- Easy to implement and understand.
- No extra memory required.

**Disadvantages**:
- Inefficient for large datasets.
- Comparisons grow linearly with the size of the array.

---

### **Summary**

- **Advantages**:  
  - Simple, versatile, and works on unsorted data.

- **Disadvantages**:  
  - Inefficient for large datasets due to \( O(N) \) time complexity.

- **When to Use**:  
  - Use Linear Search for small or unsorted datasets or when simplicity is a priority.