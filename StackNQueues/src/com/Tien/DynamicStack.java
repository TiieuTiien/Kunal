package com.Tien;

public class DynamicStack extends CustomStack{
	
	public DynamicStack() {
		super();
	}
	
	public DynamicStack(int size) {
		super(size);
	}

	@Override
	public boolean push(int item) {
		// this take care of it being full
		if(this.isFull()) {
			// double the size
			int[] temp = new int[data.length * 2];
			
			// copy of previous item in new data
			for(int i = 0; i < data.length; i++) {
				temp[i] = data[i];
			}
			
			data = temp;
		}
		
		// at this point we know we can insert item normaly
		// insert item 
		return super.push(item);
		
	}
}


















