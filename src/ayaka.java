


	public class ayaka {
		
		  /*
	    Any live cell with fewer than two live neighbours dies, as if by underpopulation.
	Any live cell with two or three live neighbours lives on to the next generation.
	Any live cell with more than three live neighbours dies, as if by overpopulation.
	Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.
	     */
	    static int screenWidth = 10;
	    static int screenHeight = 10;
	    static String deadCell = "[ ]";
	    static String liveCell = "[#]";
	    final static int gameAreaWidth = 8;
	    final static int gameAreaHeight = 8;
	    static boolean[][] data = {
	            {false,false,false,false,false,false,false,false},
	            {false,false,false,false,false,false,false,false},
	            {false,false,false,false,false,false,false,false},
	            {false,false,false,false,false,false,false,false},
	            {false,false,false,false,false,false,false,false},
	            {false,false,false,false,false,false,false,false},
	            {false,false,false,false,false,false,false,false},
	            {false,false,false,false,false,false,false,false}
	            };
	    static void calculateNextGeneration()
	        {
	        // do first rule
	            // do second rule
	            // do third rule
	            // do 4th rule
	            // update data
	            //exit
	        }
	    static int countNeighbours(int atPosX, int atPosY)
	        {
	            int count = 0;
	            if ((atPosX > 0) && (atPosX < gameAreaWidth))
	                {
	                 if (data[atPosX-1][atPosY] == true){
	                        count++;
	                    }
	                 if (data[atPosX+1][atPosY] == true){
	                        count++;
	                    }
	                }
	            if ((atPosY > 0) && (atPosY < gameAreaHeight))
	                {
	                if (data[atPosX][atPosY+1] == true){
	                        count++;
	                    }
	                 if (data[atPosX][atPosY-1] == true){
	                        count++;
	                    }
	                }
	            return count;
	        }
	    static boolean isCellAlive(int atPosX, int atPosY)
	        {
	           return data[atPosX][atPosY];
	        }
	    static void drawScreen(int aWidth, int aHeight)
	        {
	        clearScreen();
	        for (int y = 0; y < gameAreaHeight; y++)
	            {
	                for (int x = 0; x < gameAreaWidth; x++)
	                    {
	                        if (data[x][y] == true)
	                            {
	                            System.out.print(liveCell);
	                            }
	                        else
	                            {
	                             System.out.print(deadCell);
	                            }
	                    }
	                System.out.println();
	            }
	        }
	    static void clearScreen()
	        {
	        for (int i = 0; i < 100; i++)
	            {
	            System.out.println(deadCell);
	            }
	        }
	    public static void main(String[] args)
	        {
	            boolean terminateProgram = false;
	            clearScreen();
	            while (terminateProgram == false)
	                {
	                drawScreen(screenWidth, screenHeight);
	                 calculateNextGeneration();
	                }
	        }
	}
