Difference(int [] elements){
    this.elements=elements;
}

	// Add your code here
void computeDifference() {
        int maxNum = elements[0];
        int minNum = maxNum;
        for (int i = 1; i < elements.length; i++) {
            
            maxNum=elements[i]>maxNum?elements[i]:maxNum;
            minNum=elements[i]>minNum?minNum:elements[i];
            
        }
        maximumDifference=Math.abs(maxNum-minNum);
    }
   
