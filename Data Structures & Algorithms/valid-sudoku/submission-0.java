class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Character,Integer> map = new HashMap<>();
        int colCount = 1;
        int iCount =0;
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(map.containsKey(board[i][j])) return false;
                if(board[i][j] == '.') continue;
                else{
                    map.put(board[i][j],1);
                }
            }
            map.clear();
        }
        map.clear();
       for(int i = 0; i < board.length; i++) {

            for(int j = 0; j < board[i].length; j++) {

                 if(board[j][i] == '.') continue;

                 if(map.containsKey(board[j][i])) {
                     return false;
                 }

                 map.put(board[j][i], 1);
                 }

            map.clear();
         }
        for(int row = 0; row < 9; row += 3){
        for(int col = 0; col < 9; col += 3){

            map.clear();

            for(int i = row; i < row + 3; i++){
                for(int j = col; j < col + 3; j++){

                    if(board[i][j] == '.') continue;

                    if(map.containsKey(board[i][j])){
                        return false;
                    }

                    map.put(board[i][j], 1);
                }
            }
        }
    }           
        return true;
    }
}
