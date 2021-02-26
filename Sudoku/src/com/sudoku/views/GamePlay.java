
public class GamePlay {

	public static void main(String[] args) {
		
		MainBoard board = new MainBoard();
		board.setBoard(DefaultBoard.DefaultBoard01());
		if(GameConsoles.StartConsole() != 0) return;
		boolean exit = false;
		while(!exit) {
			int n = GameConsoles.MainConsole(board);
			switch(n) { 
				case 0:
					Point chosenPoint = GameConsoles.choosePoint(board);
					if(chosenPoint != null) {
						if(chosenPoint.isFixed()) GameConsoles.ErrorMessages();
						else GameConsoles.setValue(chosenPoint);
						
						if(board.valid())
						{
							GameConsoles.CompleteMessages();;
							exit = true;
						}
					}
					break;
					
				default:
					exit = true; 
					break;
			}	
		}
	}
}
