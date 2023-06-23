
public class Grid {
	private int[][] grid;
	private int gridSum =0;
	private int[] rowSum;
	private int[] colSum;
	
	Grid(int row,int col){
		int[][] newGrid= new int[row][col];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				newGrid[i][j]= i+j+1;
			}
		}
		this.grid=newGrid;
		sumGrid();
		sumRows();
		sumCols();
	}
	
	public void displayGrid() {
		for(int row=0; row<grid.length;row++) {
			for(int col=0; col<grid[row].length;col++) {
				System.out.print(this.grid[row][col]+" ");
			}
			System.out.println();
		}
	}
	private void sumGrid() {
		for(int row=0; row<grid.length;row++) {
			for(int col=0; col<grid[row].length;col++) {
				this.gridSum += grid[row][col];
			}
			
		}
	}
	public void sumRows() {
		int[] sumRows = new int[this.grid[0].length];
		for(int col =0;col<this.grid[0].length;col++) {
			int rowSum=0;
			for(int row = 0; row<this.grid.length;row++) {
				rowSum+= this.grid[row][col];
			}
			sumRows[col] = rowSum;
		}
		this.rowSum= sumRows;
	}
	
	public void sumCols() {
		int[] sumCols = new int[this.grid.length];
		for(int row =0;row<this.grid.length;row++) {
			int colSum=0;
			for(int col = 0; col<this.grid[0].length;col++) {
				colSum+= this.grid[row][col];
			}
			sumCols[row] = colSum;
		}
		this.colSum= sumCols;
	}
	
	public int getGridSum() {
		return this.gridSum;
	}
	@Override
	public String toString() {
		StringBuilder Grid= new StringBuilder();
		displayGrid();
		System.out.println();
		Grid.append("Total Sum: " + this.gridSum + "\n");
		Grid.append("Total Row Sum: " + this.rowSum[1] + "\n");
		Grid.append("Total Col Sum: " + this.colSum[1] + "\n");
		
		
		return Grid.toString();
	}
	
}
