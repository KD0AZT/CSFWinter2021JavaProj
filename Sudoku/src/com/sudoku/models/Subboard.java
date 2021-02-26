
public class Subboard extends Board {
	
	public Subboard() {
		point = new Point[3][3];
	}
	
	public void setSubboard(Point[][] mainBoardPoint,int index11Row, int index11Column) {
		for(i = 0; i < 3; i++) 
		{
			for(j = 0; j < 3; j++) {
				point[i][j] = mainBoardPoint[i + index11Row][j + index11Column];
			}
		}
	}
	
	public boolean valid() {
		
		Line line = new Line(this);
		return line.valid();
	}
}
