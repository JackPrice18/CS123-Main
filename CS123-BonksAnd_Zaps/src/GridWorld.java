import java.util.ArrayList;

public class GridWorld {
	
	private ArrayList<Being>[][] gridWorld;
	private int gameLenght = 0;
	private int GRID_SIZE_X = 20;
	private int GRID_SIZE_Y = 20;
	private int GAME_MAX_LENGTH = 60;
	private int WAIT_TIME = 1000;
	
	public GridWorld(int GSX, int GSY, int GML, int WT){
		
		
		gridWorld = new ArrayList[GRID_SIZE_X][GRID_SIZE_Y];
		
	}

	public void gameLoop() throws InterruptedException{
		
		do{
			
			
			
			Thread.sleep(WAIT_TIME);
			gameLenght++;
			
		}while(gameLenght != GAME_MAX_LENGTH);
		
	}
	
}
