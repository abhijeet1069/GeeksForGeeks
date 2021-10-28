package stack;

public class CelebrityProblemM15 {
	
	public static int celebrity(int M[][], int n)
    {
    	int a = 0, b = M.length-1;
    	while(a<b) {
    		if(M[a][b] == 1) //if a knows b then a is surely not a celebrity
    			a++;
    		else //
    			b--; //if a does not know b then b is surely not a celebrity
    	}
    	int knows=0,known=0;
    	for(int i = 0; i < M.length; i++ ) {
    		knows += M[a][i];
    		known += M[i][a];
    	}
    	if(knows == 0 && known == M.length-1) //if 'a':celebrity knows 0 people and known by all except himself 
    		return a;
    	else
    		return -1;
    	
    }
	public static void main(String[] args) {
		int[][] M = new int[][] {{0, 1},{1, 0}};
		System.out.println(celebrity(M,M.length));
	}
}
